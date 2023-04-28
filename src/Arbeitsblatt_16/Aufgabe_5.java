package Arbeitsblatt_16;

import static java.lang.System.exit;

import java.util.Arrays;
import java.util.Scanner;

public class Aufgabe_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = null;

        System.out.println("Bitte geben Sie ihre zahlen in folgendem Format ein: Zahl1; Zahl2; ...");
        String userInput = scanner.nextLine();
        scanner.close();

        userInput = userInput.replace(" ", "");
        try {
            numbers = userInput.split(";");
        }catch(Exception e) {
            System.out.println("Syntax error please try again!");
            exit(0);
        }

        System.out.print("Die eingegebenen Zahlen lauten:");
        for (int x = 0; x < numbers.length; x++) {
            System.out.print(" " + numbers[x]);
        }

        int[] numbers2 = new int[numbers.length];
        for(int x = 0; x < numbers.length; x++) {
            numbers2[x] = Integer.parseInt(numbers[x]);
        }

        Arrays.sort(numbers2);

        System.out.print("\nDie sortierten Zahlen lauten:");
        for (int x = 0; x < numbers2.length; x++) {
            System.out.print(" " + numbers2[x]);
        }

    }

}
