package ar.com.drk.lives.algorithm.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DetectLoopInListTest {

  @Test
  void detectLoopInList() {
    final ListNode<Integer> listWithLoop = getListWithLoop();
    assertTrue(DetectLoopInList.detectLoopInList(listWithLoop));
  }

  @Test
  void detectLoopInListWithoutLoop() {
    final ListNode<Integer> listWithoutLoop = getListWithoutLoop();
    assertFalse(DetectLoopInList.detectLoopInList(listWithoutLoop));
  }

  private ListNode<Integer> getListWithLoop() {
    final ListNode<Integer> integerList = new ListNode<>(1);
    integerList.append(new ListNode<>(2));
    integerList.append(new ListNode<>(3));
    final ListNode<Integer> loop = new ListNode<>(4);
    integerList.append(loop);
    integerList.append(new ListNode<>(5));
    integerList.append(new ListNode<>(6));
    final ListNode<Integer> last = new ListNode<>(7);
    integerList.append(last);
    last.setNext(loop);
    return integerList;
  }

  private ListNode<Integer> getListWithoutLoop() {
    final ListNode<Integer> integerList = new ListNode<>(1);
    integerList.append(new ListNode<>(2));
    integerList.append(new ListNode<>(3));
    integerList.append(new ListNode<>(4));
    integerList.append(new ListNode<>(5));
    integerList.append(new ListNode<>(6));
    return integerList;
  }
}