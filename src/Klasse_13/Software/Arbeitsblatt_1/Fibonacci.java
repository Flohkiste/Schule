package Arbeitsblatt_1;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int f = fibonacci(n);
        System.out.println(f);
    }
}
