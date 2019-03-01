package Easy;

// https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class Peak_Index_in_a_Mountain_Array_852 {

    public static int peakIndexInMountainArray(int[] A) {
        int index = A.length / 2;
        int i = index - 1;

        if (A[i] < A[index]) { // elemanım sağda
            int j = index + 1;
            while (A[j] > A[index]) {
                j++;
                index++;
            }
            return j - 1;
        } else { // elemanım solda
            while (A[i] > A[index]) {
                i--;
                index--;
            }
            return i + 1;
        }
    }
}
