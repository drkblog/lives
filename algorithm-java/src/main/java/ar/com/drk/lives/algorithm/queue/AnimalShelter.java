package ar.com.drk.lives.algorithm.queue;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Deque;
import java.util.LinkedList;

public class AnimalShelter {
  private final Deque<Dog> dogsQueue = new LinkedList<>();
  private final Deque<Cat> catsQueue = new LinkedList<>();
  private int timestamp = 0;

  public void enter(final Dog dog) {
    dog.setTimestamp(timestamp++);
    dogsQueue.offer(dog);
  }

  public void enter(final Cat cat) {
    cat.setTimestamp(timestamp++);
    catsQueue.offer(cat);
  }

  public Animal retrieveAny() {
    if (dogsQueue.isEmpty() && catsQueue.isEmpty()) {
      return null;
    }
    if (dogsQueue.isEmpty()) {
      return catsQueue.poll();
    }
    if (catsQueue.isEmpty()) {
      return dogsQueue.poll();
    }
    final Dog dog = dogsQueue.getFirst();
    final Cat cat = catsQueue.getFirst();
    if (dog.cameBefore(cat)) {
      return dog;
    } else {
      return cat;
    }
  }

  public Cat retrieveCat() {
    return catsQueue.poll();
  }

  public Dog retrieveDog() {
    return dogsQueue.poll();
  }

  @Getter
  @RequiredArgsConstructor
  public static abstract class Animal {
    private final String name;
    @Setter
    private int timestamp;

    public boolean cameBefore(final Animal other) {
      return timestamp < other.timestamp;
    }
  }

  public static class Cat extends Animal {
    public Cat(final String name) {
      super(name);
    }
  }

  public static class Dog extends Animal {
    public Dog(final String name) {
      super(name);
    }
  }
}
