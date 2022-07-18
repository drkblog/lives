package ar.com.drk.lives.algorithm.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class FindElementFromLastTest {

  @Test
  void findElementFromLast() {
    final ListNode<Integer> integerList = getIntegerListNode();

    final FindElementFromLast.Wrapper count = new FindElementFromLast.Wrapper();
    final ListNode<Integer> result = FindElementFromLast.findElementFromLast(
        integerList,
        2,
        count
    );

    assertEquals(5, result.getData());
  }

  @Test
  void findElementFromLast2() {
    final ListNode<Integer> integerList = getIntegerListNode();

    final FindElementFromLast.Wrapper count = new FindElementFromLast.Wrapper();
    final ListNode<Integer> result = FindElementFromLast.findElementFromLast(
        integerList,
        4,
        count
    );

    assertEquals(3, result.getData());
  }

  @Test
  void findElementFromLastOutside() {
    final ListNode<Integer> integerList = getIntegerListNode();

    final FindElementFromLast.Wrapper count = new FindElementFromLast.Wrapper();
    final ListNode<Integer> result = FindElementFromLast.findElementFromLast(
        integerList,
        30,
        count
    );

    assertNull(result);
  }

  private ListNode<Integer> getIntegerListNode() {
    final ListNode<Integer> integerList = new ListNode<>(1);
    integerList.append(new ListNode<>(2));
    integerList.append(new ListNode<>(3));
    integerList.append(new ListNode<>(4));
    integerList.append(new ListNode<>(5));
    integerList.append(new ListNode<>(6));
    return integerList;
  }
}