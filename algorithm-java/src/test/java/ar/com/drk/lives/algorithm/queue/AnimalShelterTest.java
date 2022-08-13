package ar.com.drk.lives.algorithm.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AnimalShelterTest {

  @Test
  void simpleTest() {
    final String first = "Peggy";
    final AnimalShelter animalShelter = new AnimalShelter();
    animalShelter.enter(cat(first));
    animalShelter.enter(cat("Alice"));
    animalShelter.enter(dog("Tim"));
    animalShelter.enter(cat("George"));
    assertEquals(
        first,
        animalShelter.retrieveAny().getName()
    );
  }

  @Test
  void testGetADog() {
    final String dog = "Tim";
    final AnimalShelter animalShelter = new AnimalShelter();
    animalShelter.enter(cat("Peggy"));
    animalShelter.enter(cat("Alice"));
    animalShelter.enter(dog(dog));
    animalShelter.enter(cat("George"));
    animalShelter.enter(dog("Other"));
    animalShelter.retrieveAny();
    assertEquals(
        dog,
        animalShelter.retrieveDog().getName()
    );
  }

  @Test
  void testGetACat() {
    final String cat = "Tim";
    final AnimalShelter animalShelter = new AnimalShelter();
    animalShelter.enter(dog("Peggy"));
    animalShelter.enter(cat(cat));
    animalShelter.enter(cat("Alice"));
    animalShelter.enter(cat("George"));
    animalShelter.enter(dog("Other"));
    animalShelter.retrieveDog();
    assertEquals(
        cat,
        animalShelter.retrieveCat().getName()
    );
  }

  @Test
  void testNoSuchElement() {
    final AnimalShelter animalShelter = new AnimalShelter();
    animalShelter.enter(cat("Peggy"));
    animalShelter.enter(cat("Other"));
    assertDoesNotThrow(
        () -> animalShelter.retrieveAny()
    );
  }

  private AnimalShelter.Cat cat(final String name) {
    return new AnimalShelter.Cat(name);
  }

  private AnimalShelter.Dog dog(final String name) {
    return new AnimalShelter.Dog(name);
  }
}