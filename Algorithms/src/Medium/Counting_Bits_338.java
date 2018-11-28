package Medium;

//https://leetcode.com/problems/counting-bits/
public class Counting_Bits_338 {
    public static void main(String[] args) {
        int[] ints = countBits(5);
    }

    public static int[] countBits(int num) {
        int[] arr = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            arr[i] = howManyOne(i);
        }
        return arr;
    }

    public static int howManyOne(int num) {
        int count = 0;
        // integer has 32 bits
        for (int i = 0; i < 32; i++) {
            if (num % 2 == 1) {
                count++;
            }
            num /= 2;
        }
        return count;
    }
}
