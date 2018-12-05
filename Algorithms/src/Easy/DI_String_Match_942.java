package Easy;

// https://leetcode.com/problems/di-string-match/
public class DI_String_Match_942 {
    public static void main(String[] args) {
        int[] diStringMatch = diStringMatch("IDID");
    }

    public static int[] diStringMatch(String S) {
        int[] A = new int[S.length() + 1];
        int min = 0, max = S.length();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'I') {
                A[i] = min++;
            } else {
                A[i] = max--;
            }
        }
        A[S.length()] = max;
        return A;
    }
}
