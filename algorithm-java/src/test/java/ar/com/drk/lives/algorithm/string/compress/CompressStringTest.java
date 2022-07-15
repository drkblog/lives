package ar.com.drk.lives.algorithm.string.compress;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompressStringTest {

  @Test
  void compress() {
    final String data = "aabcccccaaa";
    final String expected = "a2bc5a3";
    assertEquals(expected, CompressString.compress(data));
  }

  @Test
  void compressNoRepeatLastChar() {
    final String data = "aaahhhf";
    final String expected = "a3h3f";
    assertEquals(expected, CompressString.compress(data));
  }

  @Test
  void compressNoRepeat() {
    final String data = "abc";
    final String expected = "abc";
    assertEquals(expected, CompressString.compress(data));
  }

  @Test
  void compressEmpty() {
    final String data = "";
    final String expected = "";
    assertEquals(expected, CompressString.compress(data));
  }
}