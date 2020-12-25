package Easy;

import java.util.Arrays;

// https://leetcode.com/problems/running-sum-of-1d-array/
public class Running_Sum_of_1d_Array_1480 {
    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 4, 5};
        int[] expectedOutput = new int[]{1, 3, 6, 10, 15};
        System.out.println(Arrays.equals(expectedOutput, runningSum(input)));
    }

    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}
