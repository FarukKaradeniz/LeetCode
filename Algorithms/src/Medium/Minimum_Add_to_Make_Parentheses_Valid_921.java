package Medium;

import java.util.Stack;

//https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/
public class Minimum_Add_to_Make_Parentheses_Valid_921 {
    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("())")); // expected to return 1
        System.out.println(minAddToMakeValid("(((")); // expected to return 3
        System.out.println(minAddToMakeValid("()")); // expected to return 0
        System.out.println(minAddToMakeValid("()))((")); // expected to return 4
        System.out.println(minAddToMakeValid(")())")); // expected to return 3

    }

    public static int minAddToMakeValid(String S) {
        int popWhenStackIsEmpty = 0;
        Stack<Character> stack = new Stack<>();

        for (char c : S.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    popWhenStackIsEmpty++;
                } else {
                    stack.pop();
                }
            }
        }

        return popWhenStackIsEmpty + stack.size();
    }
}
