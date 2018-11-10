package Easy;

//https://leetcode.com/problems/transpose-matrix/description/
public class Transpose_Matrix_867 {
    public static void main(String[] args) {
        // written in leetcode editor
    }

    public static int[][] transpose(int[][] A) {
        int[][] tA = new int[A[0].length][A.length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                tA[j][i] = A[i][j];
            }
        }
        return tA;
    }
}
