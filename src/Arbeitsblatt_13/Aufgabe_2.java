package Arbeitsblatt_13;

import java.util.Scanner;

public class Aufgabe_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Geben Sie eine ganze Zahl ein: ");
        int input = scanner.nextInt();

        System.out.print(input + " ist durch ");

        for(int i = 1; i <= input; i++) {
            if(input % i == 0) {
                System.out.print("; " + i);
            }
        }

        System.out.print(" teilbar");

    }
}
