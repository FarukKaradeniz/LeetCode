package Easy;

import java.util.HashMap;
import java.util.Map;

public class Jewels_And_Stones_771 {
    public static void main(String[] args) {
        String J = "aA", S = "aAAbbbb";
        System.out.println(numJewelsInStones(J, S)); //Expected output: 3
        J = "z";
        S = "ZZ";
        System.out.println(numJewelsInStones(J, S)); //Expected output: 0
    }

    public static int numJewelsInStones(String J, String S) {
        Map<Character, Integer> count = new HashMap<>();
        for (char c : S.toCharArray()) {
            Integer i = count.get(c);
            count.put(c, i == null ? 1 : i + 1);
        }

        int output = 0;
        for (char c : J.toCharArray()) {
            output += count.get(c) == null ? 0 : count.get(c);
        }
        return output;
    }

}
