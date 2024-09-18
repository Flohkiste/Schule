package Arbeitsblatt_3;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie die Anzahl der Monate ein: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Fibonacci-Zahlen bis Monat " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + ", ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}