package Arbeitsblatt_11;

import java.util.Scanner;

public class Aufgabe_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben sie die untere Grenze ein: ");
        int lower = scanner.nextInt();

        System.out.print("Bitte geben sie die obere Grenze ein: ");
        int upper = scanner.nextInt();


        for(int i = lower; i <= upper; i++) {
            if((i%2)!=0) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
