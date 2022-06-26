package ar.com.drk.live1.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Author {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(nullable = false, unique = true)
  private String name;
}