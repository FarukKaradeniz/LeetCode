package Easy;

//https://leetcode.com/problems/shortest-distance-to-a-character/description/
public class Shortest_Distance_To_A_Character_821 {
    public static void main(String[] args) {
        int[] shortestToChar = shortestToChar("loveleetcode", 'e');
    }

    public static int[] shortestToChar(String S, char C) {
        int[] arr = new int[S.length()];
        int i, j, left, right;
        boolean x = false, y = false;
        for (i = 0; i < S.length(); i++) { //int array'e yerleştirilecekler
            j = i;
            left = 0;
            while (j > 0 && S.charAt(j) != C) { //check left hand side
                j--;
                left++;
            }
            x = S.charAt(j) != C ? false : true;

            j = i;
            right = 0;
            while (j < S.length() && S.charAt(j) != C) { //check right hand side
                j++;
                right++;
            }
            y = j == S.length() ? false : true;
            if (!x && y) {
                arr[i] = right;
            } else if (x && !y) {
                arr[i] = left;
            } else {
                arr[i] = (left < right) ? left : right;
            }
        }

        return arr;

    }

}
