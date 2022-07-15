package ar.com.drk.lives.algorithm.list;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromLinkedList {

  public static <T> void removeDuplicates(final ListNode<T> list) {
    final Set<T> elements = new HashSet<>();

    ListNode<T> node = list.getNext();
    ListNode<T> previous = list;
    elements.add(previous.getData());

    while (node != null) {
      if (elements.contains(node.getData())) {
        previous.setNext(node.getNext());
      } else {
        elements.add(node.getData());
      }
      previous = node;
      node = node.getNext();
    }
  }
}
