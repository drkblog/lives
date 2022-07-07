package ar.com.drk.lives.algorithm.string.reverse_array;

public class ReverseArray {

  public static int[] reverse(final int[] input) {
    for (int i = 0; i < input.length/2; i++) {
      input[i] ^= input[input.length - 1 - i];
      input[input.length - 1 - i] ^= input[i];
      input[i] ^= input[input.length - 1 - i];
    }
    return input;
  }
}
/*
Temporal n/2 -> O(n)
Espacial O(1)
 */