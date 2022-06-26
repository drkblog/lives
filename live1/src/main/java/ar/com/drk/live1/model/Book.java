package ar.com.drk.live1.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Book {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(nullable = false, unique = true)
  private String title;

  @ManyToOne
  private Category category;

  @ManyToMany
  private List<Author> authors;
}