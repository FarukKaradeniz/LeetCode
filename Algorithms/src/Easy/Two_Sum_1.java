package Easy;

// https://leetcode.com/problems/two-sum/
public class Two_Sum_1 {
    public static void main(String[] args) {
        int[] sum = twoSum(new int[]{2, 7, 11, 15, 26, 19, 41}, 41);
        for (int i : sum) {
            System.out.print(i + ", ");
        }
        System.out.println();
        int[] sum2 = twoSum(new int[]{3, 2, 4}, 6);
        for (int i : sum2) {
            System.out.print(i + ", ");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int i, j;
        for (i = 0; i < nums.length - 1; i++) {
            for (j = i + 1; j < nums.length; j++) {
                if (target == (nums[i] + nums[j])) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

}
