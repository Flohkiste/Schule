package Arbeitsblatt_13;

import java.util.Random;
import java.util.Scanner;

public class Aufgabe_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int input;
        int versuche = 0;

        int r = rand.nextInt(10) + 1;


        do {
            versuche += 1;
            System.out.print("Errate die Zahl (" + versuche + ". Versuch): ");
            input = scanner.nextInt();


        } while (input != r);

        System.out.println("Richtig!");
        scanner.close();
    }
}
