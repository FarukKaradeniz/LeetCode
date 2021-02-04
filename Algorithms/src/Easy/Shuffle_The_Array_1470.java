package Easy;

import java.util.Arrays;

// https://leetcode.com/problems/shuffle-the-array/
public class Shuffle_The_Array_1470 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] shuffled = new int[nums.length];

        int x = 0;
        for (int i = 0; i < n; i++) {
            shuffled[x++] = nums[i];
            shuffled[x++] = nums[i + n];
        }

        return shuffled;
    }
}
