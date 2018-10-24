package Easy;

//https://leetcode.com/problems/hamming-distance/description/
public class Hamming_Distance_461 {
    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4)); //Should print 2
        System.out.println(hammingDistance(12, 4)); //Should print 1
    }

    public static int hammingDistance(int x, int y) {
        int z = x ^ y;
        int count = 0;

        while (z > 0) {
            if (z % 2 == 1) {
                count++;
            }
            z /= 2;
        }

        return count;
    }
}
