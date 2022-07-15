package ar.com.drk.lives.algorithm.string.unique_chars;

public class UniqueChars {

  public static boolean allUniqueChars(final String string) {
    final boolean[] control = new boolean[256];
    for (int i = 0; i < string.length(); i++) {
      if (control[string.charAt(i)]) {
        return false;
      }
      control[string.charAt(i)] = true;
    }
    return true;
  }
}