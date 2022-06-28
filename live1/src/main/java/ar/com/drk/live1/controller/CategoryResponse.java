package ar.com.drk.live1.controller;

import ar.com.drk.live1.model.Category;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;

import java.util.Set;
import java.util.stream.Collectors;

@Getter
@Builder(access = AccessLevel.PRIVATE)
public class CategoryResponse {
  private long id;
  private String name;
  private Set<BookResponse> books;

  public static CategoryResponse fromCategory(final Category category) {
    final Set<BookResponse> books = category.getBooks().stream()
        .map(BookResponse::fromBook)
        .collect(Collectors.toSet());
    return CategoryResponse.builder()
        .id(category.getId())
        .name(category.getName())
        .books(books)
        .build();
  }
}
