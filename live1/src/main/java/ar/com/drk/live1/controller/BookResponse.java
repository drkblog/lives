package ar.com.drk.live1.controller;

import ar.com.drk.live1.model.Author;
import ar.com.drk.live1.model.Book;
import ar.com.drk.live1.model.Tag;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder(access = AccessLevel.PRIVATE)
public class BookResponse {
  private long id;
  private String title;
  private String category;
  private List<Author> authors;
  private List<Tag> tags;

  public static BookResponse fromBook(final Book book) {
    return BookResponse.builder()
        .id(book.getId())
        .title(book.getTitle())
        .category(book.getCategory().getName())
        .authors(book.getAuthors())
        .tags(book.getTags())
        .build();
  }
}
