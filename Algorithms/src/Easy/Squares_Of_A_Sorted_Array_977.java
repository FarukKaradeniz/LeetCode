package Easy;

// https://leetcode.com/problems/squares-of-a-sorted-array/
public class Squares_Of_A_Sorted_Array_977 {
    public static void main(String[] args) {

    }

    public static int[] sortedSquares(int[] A) {
        int[] arr = new int[A.length];
        int i = 0, j = A.length-1, k = A.length - 1;
        while (i <= j) {
            int pow2i = pow2(A[i]);
            int pow2j = pow2(A[j]);
            if (pow2i < pow2j) {
                arr[k] = pow2j;
                j--;
            }
            else {
                arr[k] = pow2i;
                i++;
            }
            k--;
        }
        return arr;
    }

    public static int pow2(int x) {
        return x * x;
    }
}
