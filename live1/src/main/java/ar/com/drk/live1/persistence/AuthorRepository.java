package ar.com.drk.live1.persistence;

import ar.com.drk.live1.model.Author;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AuthorRepository extends CrudRepository<Author, Long> {
  Optional<Author> findByName(final String name);
}