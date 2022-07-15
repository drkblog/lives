package ar.com.drk.lives.algorithm.string.unique_chars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueCharsTest {

  @Test
  void simpleUnique() {
    final String string = "abcde";
    assertTrue(UniqueChars.allUniqueChars(string));
  }

  @Test
  void simpleUniqueOther() {
    final StringBuilder stringBuilder = new StringBuilder("abcde");
    stringBuilder.append((char)200);
    stringBuilder.append("123456@#");
    assertTrue(UniqueChars.allUniqueChars(stringBuilder.toString()));
  }

  @Test
  void simpleNonUnique() {
    final String string = "abcdea";
    assertFalse(UniqueChars.allUniqueChars(string));
  }

  @Test
  void simpleNonUniqueOther() {
    final String string = "a22222kkk";
    assertFalse(UniqueChars.allUniqueChars(string));
  }
}