package ar.com.drk.lives.algorithm.string.reverse_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseArrayTest {

  @Test
  void reverse() {
    final int[] input = new int[] {1,2,3,4,5};
    final int[] expected = new int[] {5,4,3,2,1};
    assertArrayEquals(expected, ReverseArray.reverse(input));
  }

  @Test
  void reverseEmpty() {
    final int[] input = new int[] {};
    final int[] expected = new int[] {};
    assertArrayEquals(expected, ReverseArray.reverse(input));
  }

  @Test
  void reverseOne() {
    final int[] input = new int[] {2};
    final int[] expected = new int[] {2};
    assertArrayEquals(expected, ReverseArray.reverse(input));
  }

  @Test
  void reverseTwo() {
    final int[] input = new int[] {2,5};
    final int[] expected = new int[] {5,2};
    assertArrayEquals(expected, ReverseArray.reverse(input));
  }

  @Test
  void reverseOther() {
    final int[] input = new int[] {60,50,40,30};
    final int[] expected = new int[] {30,40,50,60};
    assertArrayEquals(expected, ReverseArray.reverse(input));
  }
}