package Easy;

//https://leetcode.com/problems/reverse-string/description/
public class Reverse_String_344 {
    public static void main(String[] args) {
        System.out.println(reverseString("hello")); //should print "olleh"
        System.out.println(reverseString("hell")); //should print "lleh"
        System.out.println(reverseString("")); //should print ""
    }

    public static String reverseString(String s) {
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
