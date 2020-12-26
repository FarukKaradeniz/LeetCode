package Easy;

// https://leetcode.com/problems/richest-customer-wealth/
public class Richest_Customer_Wealth_1672 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {3, 2, 1}
        };
        System.out.println(maximumWealth(arr) == 6);
    }

    public static int maximumWealth(int[][] accounts) {
        int max = 0;

        for (int[] account : accounts) {
            int curr = 0;
            for (int i : account) {
                curr += i;
            }
            if (curr > max) {
                max = curr;
            }
        }

        return max;
    }
}
