package Easy;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/self-dividing-numbers/
public class Self_Dividing_Numbers_728 {
    public static void main(String[] args) {
        List<Integer> list = selfDividingNumbers(1, 22);
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            List<Integer> digits = digits(i);
            if (digits.contains(0)) {
                continue;
            }
            boolean divisible = true;
            int j = 0;
            while (j < digits.size() && divisible) {
                divisible = i % digits.get(j) == 0;
                j++;
            }
            if (divisible) {
                list.add(i);
            }

        }


        return list;
    }

    public static List<Integer> digits(int num) {
        List<Integer> list = new ArrayList<>();
        while (num > 0) {
            list.add(num % 10);
            num /= 10;
        }
        return list;
    }
}
