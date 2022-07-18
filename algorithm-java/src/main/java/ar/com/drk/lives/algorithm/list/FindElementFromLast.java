package ar.com.drk.lives.algorithm.list;

public class FindElementFromLast {

  public static class Wrapper {
    public int value;
  }

  public static <T> ListNode<T> findElementFromLast(
      final ListNode<T> head,
      final int k,
      final Wrapper count
  ) {
    if (head == null) {
      count.value = 0;
      return null;
    }

    final ListNode<T> node = findElementFromLast(head.getNext(), k, count);
    count.value++;

    if (k == count.value) {
      return head;
    }
    return node;
  }
}
