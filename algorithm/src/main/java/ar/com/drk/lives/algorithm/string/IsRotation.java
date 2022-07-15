package ar.com.drk.lives.algorithm.string;

public class IsRotation {

  public static boolean isRotation(
      final String s1,
      final String s2
  ) {
    if (s1.length() != s2.length()) {
      return false;
    }
    return isSubstring(s1 + s1, s2);
  }

  private static boolean isSubstring(
      final String string,
      final String substring
  ) {
    return string.contains(substring);
  }
}
