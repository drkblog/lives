package ar.com.drk.lives.algorithm.list;

import java.util.Stack;

public class IsPalindrome {

  // Temporal O(n)
  // Espacial

  public <T> boolean isPalindrome(final ListNode<T> head) {
    // 1, 2, 3, 4, 5, 6 -> false
    // 1, 2, 3, 3, 2, 1 -> true

    final Stack<T> stack = new Stack<>();
    ListNode<T> slow = head;
    ListNode<T> fast = head;
    while (fast != null) {
      stack.push(slow.getData());
      slow = slow.getNext();
      if (fast.getNext() != null) {
        fast = fast.getNext().getNext(); // Even
      } else {
        fast = null; // Odd
        stack.pop();
      }
    }

    while (slow != null) {
      if (!slow.getData().equals(stack.pop())) {
        return false;
      }
      slow = slow.getNext();
    }
    return true;
  }
}
