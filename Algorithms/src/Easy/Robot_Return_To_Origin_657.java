package Easy;

//https://leetcode.com/problems/robot-return-to-origin/description/
public class Robot_Return_To_Origin_657 {
    public static void main(String[] args) {
        System.out.println(judgeCircle("UD")); // should return true
        System.out.println(judgeCircle("LL")); // should return false
        System.out.println(judgeCircle("UDLR")); // should return true
        System.out.println(judgeCircle("LDRRLRUULR")); // should return false
    }

    public static boolean judgeCircle(String moves) {
        int u = 0, d = 0, l = 0, r = 0; // counters
        for (char c : moves.toCharArray()) {
            if (c == 'U') u++;
            else if (c == 'D') d++;
            else if (c == 'L') l++;
            else r++;
        }
        return ((Math.abs(u - d)) + (Math.abs(l - r))) == 0;
    }

}
