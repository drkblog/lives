package ar.com.drk.lives.algorithm.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsPalindromeTest {

  @Test
  void isPalindromeOdd() {
    // 1, 2, 3, 4, 3, 2, 1
    final IsPalindrome ip = new IsPalindrome();
    final ListNode<Integer> pal = getOddPalindromeList();
    assertTrue(ip.isPalindrome(pal));
  }

  @Test
  void notIsPalindromeOdd() {
    // 1, 2, 3, 4, 5, 6, 7
    final IsPalindrome ip = new IsPalindrome();
    final ListNode<Integer> noPal = getOddNormalList();
    assertFalse(ip.isPalindrome(noPal));
  }

  @Test
  void isPalindromeEven() {
    // 1, 2, 3, 3, 2, 1
    final IsPalindrome ip = new IsPalindrome();
    final ListNode<Integer> pal = getEvenPalindromeList();
    assertTrue(ip.isPalindrome(pal));
  }

  @Test
  void notIsPalindromeEven() {
    // 1, 2, 3, 4, 5, 6
    final IsPalindrome ip = new IsPalindrome();
    final ListNode<Integer> noPal = getEvenNormalList();
    assertFalse(ip.isPalindrome(noPal));
  }

  @Test
  void nullList() {
    final IsPalindrome ip = new IsPalindrome();
    assertTrue(ip.isPalindrome(null));
  }

  @Test
  void singleElement() {
    final IsPalindrome ip = new IsPalindrome();
    assertTrue(ip.isPalindrome(new ListNode<>(8)));
  }

  @Test
  void twoElementNot() {
    final IsPalindrome ip = new IsPalindrome();
    final ListNode<String> head = new ListNode<>("A");
    head.append(new ListNode<>("B"));
    assertFalse(ip.isPalindrome(head));
  }

  @Test
  void twoElementYes() {
    final IsPalindrome ip = new IsPalindrome();
    final ListNode<String> head = new ListNode<>("B");
    head.append(new ListNode<>("B"));
    assertTrue(ip.isPalindrome(head));
  }

  private ListNode<Integer> getOddNormalList() {
    final ListNode<Integer> integerList = new ListNode<>(1);
    integerList.append(new ListNode<>(2));
    integerList.append(new ListNode<>(3));
    integerList.append(new ListNode<>(4));
    integerList.append(new ListNode<>(5));
    integerList.append(new ListNode<>(6));
    integerList.append(new ListNode<>(7));
    return integerList;
  }

  private ListNode<Integer> getOddPalindromeList() {
    final ListNode<Integer> integerList = new ListNode<>(1);
    integerList.append(new ListNode<>(2));
    integerList.append(new ListNode<>(3));
    integerList.append(new ListNode<>(4));
    integerList.append(new ListNode<>(3));
    integerList.append(new ListNode<>(2));
    integerList.append(new ListNode<>(1));
    return integerList;
  }

  private ListNode<Integer> getEvenNormalList() {
    final ListNode<Integer> integerList = new ListNode<>(1);
    integerList.append(new ListNode<>(2));
    integerList.append(new ListNode<>(3));
    integerList.append(new ListNode<>(4));
    integerList.append(new ListNode<>(5));
    integerList.append(new ListNode<>(6));
    return integerList;
  }

  private ListNode<Integer> getEvenPalindromeList() {
    final ListNode<Integer> integerList = new ListNode<>(1);
    integerList.append(new ListNode<>(2));
    integerList.append(new ListNode<>(3));
    integerList.append(new ListNode<>(3));
    integerList.append(new ListNode<>(2));
    integerList.append(new ListNode<>(1));
    return integerList;
  }
}