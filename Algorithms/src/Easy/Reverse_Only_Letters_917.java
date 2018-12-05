package Easy;

// https://leetcode.com/problems/reverse-only-letters/
public class Reverse_Only_Letters_917 {
    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("hel-lo"));
    }

    public static String reverseOnlyLetters(String S) {
        char[] arr = S.toCharArray();
        int i = 0, j = S.length() - 1;
        while (i < j) {
            if (!isChar(arr[i])) {
                i++;
                continue;
            } else if (!isChar(arr[j])) {
                j--;
                continue;
            } else {
                char tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                j--;
                i++;
            }
        }
        return new String(arr);
    }

    public static boolean isChar(char c) {
        return (c >= 65 && c <= 90) || (c >= 97 && c <= 122);
    }
}
