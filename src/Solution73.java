/**
 * Created by _xiaoxiao7 on 2017/8/12.
 */
public class Solution73 {
    public void setZeroes(int[][] matrix) {
        if (matrix == null) return;

        int m = matrix.length;
        int n = matrix[0].length;

        boolean hasRowZero = false;
        boolean hasColZero = false;

        for(int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                hasColZero = true;
                break;
            }
        }

        for(int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                hasRowZero = true;
                break;
            }
        }

        for(int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < m; i++) {
            if (matrix[i][0] == 0) unifyRow(matrix, i, m, n);
        }

        for (int j = 1; j < n; j++) {
            if (matrix[0][j] == 0) unifyCol(matrix, j, m, n);
        }

        if (hasRowZero) unifyRow(matrix, 0, m, n);
        if (hasColZero) unifyCol(matrix, 0, m, n);
    }

    public void unifyRow(int[][]matrix, int i, int m, int n) {
        for (int j = 0; j < n; j++) matrix[i][j] = 0;
    }

    public void unifyCol(int[][]matrix, int j, int m, int n) {
        for (int i = 0; i < m; i++) matrix[i][j] = 0;
    }
}