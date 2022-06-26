package ar.com.drk.live1.persistence;

import ar.com.drk.live1.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
  List<Book> findByTitle(String title);
}