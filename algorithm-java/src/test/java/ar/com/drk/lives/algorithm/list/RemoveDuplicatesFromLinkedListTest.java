package ar.com.drk.lives.algorithm.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class RemoveDuplicatesFromLinkedListTest {

  @Test
  void removeDuplicates() {
    final ListNode<Integer> integerList = new ListNode<>(1);
    integerList.append(new ListNode<>(2));
    integerList.append(new ListNode<>(2));
    integerList.append(new ListNode<>(3));
    integerList.append(new ListNode<>(3));
    integerList.append(new ListNode<>(4));
    final ListNode<Integer> expectedList = new ListNode<>(1);
    expectedList.append(new ListNode<>(2));
    expectedList.append(new ListNode<>(3));
    expectedList.append(new ListNode<>(4));

    RemoveDuplicatesFromLinkedList.removeDuplicates(integerList);

    assertTrue(ListNode.areEqual(integerList, expectedList));
  }

  @Test
  void removeDuplicatesNoDuplicates() {
    final ListNode<Integer> integerList = new ListNode<>(1);
    integerList.append(new ListNode<>(2));
    integerList.append(new ListNode<>(3));
    integerList.append(new ListNode<>(4));
    final ListNode<Integer> expectedList = new ListNode<>(1);
    expectedList.append(new ListNode<>(2));
    expectedList.append(new ListNode<>(3));
    expectedList.append(new ListNode<>(4));

    RemoveDuplicatesFromLinkedList.removeDuplicates(integerList);

    assertTrue(ListNode.areEqual(integerList, expectedList));
  }
}