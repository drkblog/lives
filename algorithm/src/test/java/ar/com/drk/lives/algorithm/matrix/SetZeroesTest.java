package ar.com.drk.lives.algorithm.matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SetZeroesTest {

  @Test
  void setZeroesSquare() {
    final int[][] matrix = new int[][]{
        {1, 2, 3, 4, 5},
        {1, 0, 3, 4, 5},
        {1, 2, 3, 4, 5},
        {1, 2, 3, 0, 5},
        {1, 2, 3, 4, 5},
    };
    final int[][] expected = new int[][]{
        {1, 0, 3, 0, 5},
        {0, 0, 0, 0, 0},
        {1, 0, 3, 0, 5},
        {0, 0, 0, 0, 0},
        {1, 0, 3, 0, 5},
    };
    SetZeroes.setZeroes(matrix);
    assertArrayEquals(expected, matrix);
  }

  @Test
  void setZeroes() {
    final int[][] matrix = new int[][]{
        {1, 2, 3, 4, 5},
        {1, 2, 3, 4, 5},
        {1, 0, 3, 4, 5},
    };
    final int[][] expected = new int[][]{
        {1, 0, 3, 4, 5},
        {1, 0, 3, 4, 5},
        {0, 0, 0, 0, 0},
    };
    SetZeroes.setZeroes(matrix);
    assertArrayEquals(expected, matrix);
  }
}