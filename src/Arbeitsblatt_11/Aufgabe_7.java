package Arbeitsblatt_11;

import java.util.Scanner;

public class Aufgabe_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie n ein: ");
        int n = scanner.nextInt();
        int solution = 0;

        for(int i=1; i<=n;i++) {
            solution = (int) (solution + Math.pow(i, 2));
        }

        System.out.println(solution);



        for(int i=1; i<=n;i++) {
            solution = (int) (solution + Math.pow((i*2), 2));
        }

        System.out.println(solution);

    }
}
