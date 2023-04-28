package Arbeitsblatt_16;

import java.util.Scanner;
import static java.lang.System.exit;

public class Aufgabe_1 {

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


        System.out.print("\nDie Summe der Zahlen lautet: ");
        int result = 0;

        for(int x = 0; x < numbers.length; x++) {
            result = result + Integer.parseInt(numbers[x]);
        }
        System.out.print(result);


    }

}
