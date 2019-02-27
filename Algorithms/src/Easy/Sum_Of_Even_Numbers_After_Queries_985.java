package Easy;

// https://leetcode.com/problems/sum-of-even-numbers-after-queries/
public class Sum_Of_Even_Numbers_After_Queries_985 {
    public static int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] newArr = new int[A.length];
        int sum = sumOfEvenValues(A);


        for (int i = 0; i < queries.length; i++) {
            int oldVal = A[queries[i][1]];
            int newVal = oldVal + queries[i][0];

            if (Math.abs(oldVal) % 2 == 1 && Math.abs(newVal) % 2 == 0) {
                sum += newVal;
            } else if (Math.abs(oldVal) % 2 == 0 && Math.abs(newVal) % 2 == 0) {
                sum += queries[i][0];
            } else if (Math.abs(oldVal) % 2 == 0 && Math.abs(newVal) % 2 == 1) {
                sum -= oldVal;
            }

            A[queries[i][1]] = newVal;
            newArr[i] = sum;
        }

        return newArr;
    }

    public static int sumOfEvenValues(int[] arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
