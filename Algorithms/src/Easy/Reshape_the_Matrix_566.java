package Easy;

// https://leetcode.com/problems/reshape-the-matrix/
public class Reshape_the_Matrix_566 {
    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        int[] oneDim = new int[r * c];
        int k = 0;
        for (int i = 0; i < nums.length; i++) { //transforming 2d matrix to 1d array
            for (int j = 0; j < nums[i].length; j++) {
                oneDim[k++] = nums[i][j];
            }
        }

        int[][] matrix = new int[r][c];
        int m = 0;
        for (int i = 0; i < r; i++) {
            int[] column = new int[c];
            for (int j = 0; j < c; j++) {
                matrix[i][j] = oneDim[m++];
            }
        }
        return k < (r * c) ? nums : matrix;
    }
}
