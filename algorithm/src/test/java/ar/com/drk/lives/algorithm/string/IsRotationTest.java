package ar.com.drk.lives.algorithm.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsRotationTest {

  @Test
  void isRotation() {
    assertTrue(IsRotation.isRotation("abcdefg", "defgabc"));
  }

  @Test
  void isNotRotation() {
    assertFalse(IsRotation.isRotation("abcdefg", "defganm"));
  }

  @Test
  void isNotRotation2() {
    assertFalse(IsRotation.isRotation("abcdefg", "defga"));
  }
}