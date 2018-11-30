package Easy;

// https://leetcode.com/problems/monotonic-array/
public class Monotonic_Array_896 {
    public static void main(String[] args) {
        System.out.println(isMonotonic(new int[]{1, 2, 3}));
    }

    public static boolean isMonotonic(int[] A) {
        boolean isDecreasing = true;
        for (int i = 0, j = 1; i < A.length - 1; i++, j++) {
            if (A[i] != A[j]) {
                isDecreasing = A[i] > A[j];
                break;
            }
        }

        if (isDecreasing) {
            int min = A[0];
            for (int aA : A) {
                if (min >= aA) {
                    min = aA;
                } else {
                    return false;
                }
            }
        } else {
            int max = A[0];
            for (int aA : A) {
                if (max <= aA) {
                    max = aA;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
