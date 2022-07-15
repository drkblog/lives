package ar.com.drk.lives.algorithm.matrix;

public class SetZeroes {

  // Temporal 2 x n x m => O(n x m)
  // Espacial n + m => O(n + m)
  public static void setZeroes(final int[][] matrix) {
    final int n = matrix.length;
    final int m = matrix[0].length;

    final boolean[] columns = new boolean[n];
    final boolean[] rows = new boolean[m];

    for (int x = 0; x < n; x++) {
      for (int y = 0; y < m; y++) {
        if (matrix[x][y] == 0) {
          columns[x] = true;
          rows[y] = true;
        }
      }
    }

    for (int x = 0; x < n; x++) {
      for (int y = 0; y < m; y++) {
        if (columns[x] || rows[y]) {
          matrix[x][y] = 0;
        }
      }
    }
  }
}
