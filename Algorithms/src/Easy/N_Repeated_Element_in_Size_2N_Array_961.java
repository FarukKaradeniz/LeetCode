package Easy;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
public class N_Repeated_Element_in_Size_2N_Array_961 {
    public static void main(String[] args) {
        System.out.println(repeatedNTimes(new int[]{1, 2, 3, 3}));
        System.out.println(repeatedNTimes(new int[]{2, 1, 2, 5, 3, 2}));
        System.out.println(repeatedNTimes(new int[]{5, 1, 5, 2, 5, 3, 5, 4}));
    }

    public static int repeatedNTimes(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (map.containsKey(A[i])) {
                return A[i];
            }
            map.put(A[i], i);
        }
        return 0;
    }
}
