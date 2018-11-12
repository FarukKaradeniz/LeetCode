package Easy;

//https://leetcode.com/problems/rotate-string/description/
public class Rotate_String_796 {
    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "cdeab"));
    }

    public static boolean rotateString(String A, String B) {
        if (A.length() != B.length())
            return false;
        if (A.equals(B))
            return true;


        int start = 0;
        int i = 0;
        boolean equal = false;


        while (i < A.length() && !equal) {
            if (!B.equals(A.substring(start) + A.substring(0, start))) {
                start++;
                i++;
            } else {
                equal = true;
            }
        }


        return equal;
    }
}
