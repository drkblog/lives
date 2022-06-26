package ar.com.drk.live1.persistence;

import ar.com.drk.live1.model.Tag;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TagRepository extends CrudRepository<Tag, Long> {
  Optional<Tag> findByName(final String name);
}