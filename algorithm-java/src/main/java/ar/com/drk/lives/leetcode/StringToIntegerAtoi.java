package ar.com.drk.lives.leetcode;

public class StringToIntegerAtoi {
  enum Stage {
    TRAILING,
    SIGN,
    NUMBER
  }

  public int myAtoi(final String s) {
    Stage stage = Stage.TRAILING;
    long integer = 0;
    int sign = 1;
    int i = 0;
    boolean end = false;
    while (i < s.length() && !end) {
      final char ch = s.charAt(i);
      switch (stage) {
        case TRAILING:
          if (ch == ' ') {
            i++;
          } else if (ch == '+' || ch == '-') {
            stage = Stage.SIGN;
          } else if (ch >= '0' && ch <= '9') {
            stage = Stage.NUMBER;
          } else {
            return 0;
          }
          break;
        case SIGN:
          if (ch == '-') {
            sign = -1;
          }
          i++;
          stage = Stage.NUMBER;
          break;
        case NUMBER:
          if (ch >= '0' && ch <= '9') {
            integer *= 10;
            integer += ch - '0';
            if (integer > Integer.MAX_VALUE) {
              integer = Integer.MAX_VALUE;
              integer += (sign == 1) ? 0 : 1;
              end = true;
            }
          } else {
            end = true;
          }
          i++;
          break;
      }
    }
    return (int) integer * sign;
  }
}
