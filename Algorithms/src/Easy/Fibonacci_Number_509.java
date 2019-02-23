package Easy;

// https://leetcode.com/problems/fibonacci-number/
public class Fibonacci_Number_509 {
    public static void main(String[] args) {
        System.out.println(fib(10));
    }

    public static int fib(int N) {
        if (N == 0 || N == 1) {
            return N;
        } else {
            return fib(N - 1) + fib(N - 2);
        }
    }
}
