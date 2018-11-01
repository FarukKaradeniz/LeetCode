package Easy;

//https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
public class Reverse_Words_In_A_String_III_557 {
    public static void main(String[] args) {
        System.out.println(reverseWords("Note: is Run Code inconsistent with Submit Solution"));
    }

    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder(s.length());
        for (String word : words) {
            sb.append(reverseString(word) + " ");
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }

    private static String reverseString(String s) {
        int i = 0, j = s.length() - 1;
        char[] arr = s.toCharArray();
        while (i < j) {
            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
        return new String(arr);
    }
}
