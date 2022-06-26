package ar.com.drk.live1.persistence;

import ar.com.drk.live1.model.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {
  Optional<Category> findByName(final String name);
}