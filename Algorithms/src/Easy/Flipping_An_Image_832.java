package Easy;

//https://leetcode.com/problems/flipping-an-image/description/
public class Flipping_An_Image_832 {
    public static void main(String[] args) {
        int[] row1 = new int[]{1, 1, 0};
        int[] row2 = new int[]{1, 0, 1};
        int[] row3 = new int[]{0, 0, 0};

        int[][] image = new int[3][3];
        image[0] = row1;
        image[1] = row2;
        image[2] = row3;

        int[][] flipped = flipAndInvertImage(image);
    }

    public static int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = flip(A[i]);
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = A[i][j] == 0 ? 1 : 0;
            }
        }

        return A;
    }

    public static int[] flip(int[] row) {
        int i = 0, j = row.length - 1;
        while (i < j) {
            int tmp = row[i];
            row[i] = row[j];
            row[j] = tmp;
            i++;
            j--;
        }
        return row;
    }

}
