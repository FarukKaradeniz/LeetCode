package Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/word-pattern/
public class Word_Pattern_290 {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
    }

    public static boolean wordPattern(String pattern, String str) {
        char[] chars = pattern.toCharArray();
        String[] strings = str.split("\\s");
        if (strings.length != chars.length) {
            return false;
        }
        HashMap<Character, String> map = new HashMap();
        Set<String> sSet = new HashSet();
        Set<Character> cSet = new HashSet();
        for (int i = 0; i < chars.length; i++) {
            if (!map.containsKey(chars[i])) {
                map.put(chars[i], strings[i]);
            } else {
                if (!map.get(chars[i]).equals(strings[i])) {
                    return false;
                }
            }
            sSet.add(strings[i]);
            cSet.add(chars[i]);
        }
        if (sSet.size() != cSet.size()) {
            return false;
        }
        return true;
    }
}
