package ar.com.drk.lives.tmp;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

class ListDemo {

  @Getter
  @Setter
  @RequiredArgsConstructor
  static class Node<T> {
    private final T value;
    private Node<T> next;
    private Node<T> previous;
  }

  public static void main(String[] args) {
    Node<Integer> firstNode = new Node<>(10);
    Node<Integer> secondNode = new Node<>(20);
    firstNode.setNext(secondNode);
    secondNode.setPrevious(firstNode);
    Node<Integer> thirdNode = new Node<>(30);
    secondNode.setNext(thirdNode);
    thirdNode.setPrevious(secondNode);

    Node<Integer> current = firstNode;
    do {
      System.out.println(current.getValue());
      current = current.getNext();
    } while (current != null);
  }

}