package ar.com.drk.lives.algorithm.list;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@RequiredArgsConstructor
public class ListNode<T> {
  private final T data;
  @Setter
  private ListNode<T> next;

  public void append(final ListNode<T> node) {
    if (next != null) {
      next.append(node);
    } else {
      next = node;
    }
  }

  public static <T> boolean areEqual(
      final ListNode<T> l1,
      final ListNode<T> l2
  ) {
    ListNode<T> p1 = l1;
    ListNode<T> p2 = l2;
    while (p1 != null && p2 != null) {
      if (!p1.getData().equals(p2.getData())) {
        return false;
      }
      p1 = p1.getNext();
      p2 = p2.getNext();
    }
    return p1 == null && p2 == null;
  }
}
