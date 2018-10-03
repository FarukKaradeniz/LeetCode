package Easy;

public class Sort_Array_By_Parity_905 {
    public static void main(String[] args) {
        int[] a = new int[]{3, 1, 2, 4};
        int[] b = sortArrayByParity(a);
        for (int x : b) {
            System.out.print(x + ", ");
        }
        System.out.println();
        int[] x = new int[]{2, 4, 3, 6, 8, 7, 1};
        for (int m : sortArrayByParity(x)) {
            System.out.print(m + ", ");
        }
    }

    public static int[] sortArrayByParity(int[] A) {
        int j = A.length - 1, i = 0;
        while (i < j) {
            if (A[i] % 2 == 1) {
                if (A[j] % 2 == 0) {
                    int tmp = A[i];
                    A[i] = A[j];
                    A[j] = tmp;
                    i++;
                }
                j--;
            } else {
                i++;
            }
        }
        return A;
    }
}
