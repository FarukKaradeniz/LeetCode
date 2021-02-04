package Easy;

// https://leetcode.com/problems/goal-parser-interpretation/
public class Goal_Parser_Interpretation_1678 {

    public static void main(String[] args) {
        System.out.println(interpret("G()(al)"));
    }

    public static String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        char prev = 0;
        for (char c : command.toCharArray()) {
            if (c == 'G') sb.append(c);
            if (c == ')') {
                if (prev == '(') {
                    sb.append('o');
                } else {
                    sb.append("al");
                }
            }
            prev = c;
        }

        return sb.toString();
    }
}
