package Medium;

// https://leetcode.com/problems/max-increase-to-keep-city-skyline/description/
public class Max_Increase_to_Keep_City_Skyline_807 {
    public static void main(String[] args) {
        int[] grid1 = new int[]{3, 0, 8, 4};
        int[] grid2 = new int[]{2, 4, 5, 7};
        int[] grid3 = new int[]{9, 2, 6, 3};
        int[] grid4 = new int[]{0, 3, 1, 0};

        int[][] realgrid = new int[4][4];
        realgrid[0] = grid1;
        realgrid[1] = grid2;
        realgrid[2] = grid3;
        realgrid[3] = grid4;

        System.out.println(maxIncreaseKeepingSkyline(realgrid));
    }

    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] top = new int[grid.length];
        int[] left = new int[grid.length];
        int sum = 0;

        for (int i = 0; i < grid.length; i++) {
            int maxT = 0, maxL = 0;
            for (int j = 0; j < grid.length; j++) {
                if (grid[j][i] > maxT) {
                    maxT = grid[j][i];
                }
                if (grid[i][j] > maxL) {
                    maxL = grid[i][j];
                }
                sum += grid[i][j];
            }
            top[i] = maxT;
            left[i] = maxL;
        }

        int newSum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                newSum += top[j] < left[i] ? top[j] : left[i];
            }
        }

        return newSum - sum;
    }
}
