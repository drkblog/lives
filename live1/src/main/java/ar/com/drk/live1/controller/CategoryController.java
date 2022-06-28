package ar.com.drk.live1.controller;

import ar.com.drk.live1.persistence.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categories")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CategoryController {

  private CategoryRepository categoryRepository;

  @GetMapping("/{id}")
  public CategoryResponse findOne(@PathVariable final Long id) {
    return CategoryResponse.fromCategory(categoryRepository.findById(id).get());
  }
}
