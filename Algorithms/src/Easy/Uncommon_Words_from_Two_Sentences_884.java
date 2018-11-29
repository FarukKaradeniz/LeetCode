package Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/uncommon-words-from-two-sentences/
public class Uncommon_Words_from_Two_Sentences_884 {

    public static void main(String[] args) {
        String[] strings = uncommonFromSentences("apple apple", "banana");
    }

    public static String[] uncommonFromSentences(String A, String B) {
        String[] aList = A.split("\\s");
        String[] bList = B.split("\\s");
        ArrayList<String> c = new ArrayList<>();
        Map<String, Integer> map = new HashMap();

        populateMap(aList, map);
        populateMap(bList, map);

        for (String s : map.keySet()) {
            if (map.get(s) == 1) {
                c.add(s);
            }
        }


        return c.toArray(new String[c.size()]);
    }

    private static void populateMap(String[] aList, Map<String, Integer> map) {
        for (String anAList : aList) {
            if (map.get(anAList) == null) {
                map.put(anAList, 1);
            } else {
                int old = map.get(anAList);
                map.put(anAList, ++old);
            }
        }
    }
}
