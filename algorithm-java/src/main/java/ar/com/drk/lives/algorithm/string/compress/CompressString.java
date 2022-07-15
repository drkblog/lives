package ar.com.drk.lives.algorithm.string.compress;

public class CompressString {

  public static String compress(final String data) {
    if (data.isEmpty()) {
      return "";
    }
    final StringBuilder builder = new StringBuilder();
    char previous = data.charAt(0);
    int count = 1;
    for (int i = 1; i < data.length(); i++) {
      char current = data.charAt(i);
      if (current == previous) {
        count++;
      } else {
        builder.append(previous);
        if (count > 1) {
          builder.append(count);
        }
        previous = current;
        count = 1;
      }
    }
    builder.append(previous);
    if (count > 1) {
      builder.append(count);
    }
    return builder.toString();
  }
}
