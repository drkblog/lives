package ar.com.drk.lives.algorithm.list;

import java.util.HashSet;
import java.util.Set;

public class DetectLoopInList {

  public static <T> boolean detectLoopInList(
      final ListNode<T> head
  ) {
    if (head == null) {
      return false;
    }
    ListNode<T> fast = head.getNext();
    ListNode<T> slow = head;
    while (fast != null && slow != null) {
      if (fast == slow) {
        return true;
      }

      if (fast.getNext() == null) {
        return false;
      }
      fast = fast.getNext().getNext();
      slow = slow.getNext();
    }
    return false;
  }

// Temporal O(n)
// Espacial O(1)

  public static <T> boolean detectLoopInListHashtable(
      final ListNode<T> head
  ) {
    final Set<ListNode<T>> elements = new HashSet<>();
    ListNode<T> runner = head;
    while (runner != null) {
      if (elements.contains(runner)) {
        return true;
      }
      elements.add(runner);
      runner = runner.getNext();
    }
    return false;
  }
}

// Temporal O(n)
// Espacial O(n)
