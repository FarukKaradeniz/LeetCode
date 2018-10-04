package Easy;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/unique-morse-code-words/description/
public class Unique_Morse_Code_Words_804 {
    public static void main(String[] args) {
        String[] words = new String[]{"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }

    public static int uniqueMorseRepresentations(String[] words) {
        String[] arr = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
                "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> set = new HashSet<>();
        for (String string : words) {
            StringBuilder builder = new StringBuilder();
            for (char c : string.toCharArray()) {
                builder.append(arr[c - 'a']);
            }
            set.add(builder.toString());
        }

        return set.size();
    }
}
