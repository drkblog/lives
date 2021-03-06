package ar.com.drk.live1.controller;

import ar.com.drk.live1.error_handling.BookIdMismatchException;
import ar.com.drk.live1.error_handling.BookNotFoundException;
import ar.com.drk.live1.model.Author;
import ar.com.drk.live1.model.Book;
import ar.com.drk.live1.model.Tag;
import ar.com.drk.live1.persistence.AuthorRepository;
import ar.com.drk.live1.persistence.BookRepository;
import ar.com.drk.live1.persistence.CategoryRepository;
import ar.com.drk.live1.persistence.TagRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/books")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class BookController {

  private BookRepository bookRepository;
  private CategoryRepository categoryRepository;
  private AuthorRepository authorRepository;
  private TagRepository tagRepository;

  @GetMapping
  public Iterable<Book> findAll() {
    return bookRepository.findAll();
  }

  @GetMapping("/title/{bookTitle}")
  public ResponseEntity<List<Book>> findByTitle(@PathVariable final String bookTitle) {
    return new ResponseEntity<>(bookRepository.findByTitle(bookTitle), HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public BookResponse findOne(@PathVariable final Long id) {
    return BookResponse.fromBook(bookRepository.findById(id)
        .orElseThrow(BookNotFoundException::new));
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public BookResponse create(@RequestBody final Book book) {
    // Shortcut - if we had proper DTOs we would have received ids for category and authors
    // Also, we assume the entities we receive match one entity already persisted.
    book.setCategory(categoryRepository.findByName(book.getCategory().getName()).get());
    final List<Author> fromRepositoryAuthors = book.getAuthors().stream()
        .map(author -> authorRepository.findByName(author.getName()).get())
        .collect(Collectors.toList());
    book.setAuthors(fromRepositoryAuthors); // This violates encapsulation
    final List<Tag> fromRepositoryTags = book.getTags().stream()
        .map(tag -> tagRepository.findByName(tag.getName()).orElseGet(() -> tagRepository.save(new Tag(0, tag.getName()))))
        .collect(Collectors.toList());
    book.setTags(fromRepositoryTags); // This violates encapsulation
    return BookResponse.fromBook(bookRepository.save(book));
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable final Long id) {
    bookRepository.findById(id)
        .orElseThrow(BookNotFoundException::new);
    bookRepository.deleteById(id);
  }

  @PutMapping("/{id}")
  public Book updateBook(@RequestBody final Book book, @PathVariable final Long id) {
    if (book.getId() != id) {
      throw new BookIdMismatchException();
    }
    bookRepository.findById(id)
        .orElseThrow(BookNotFoundException::new);
    return bookRepository.save(book);
  }
}