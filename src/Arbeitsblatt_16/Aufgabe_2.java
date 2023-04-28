package Arbeitsblatt_16;

import static java.lang.System.exit;

import java.util.Scanner;

public class Aufgabe_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = null;

        System.out.println("Bitte geben Sie die Noten in folgendem Format ein: Note1; Note2; ...");
        String userInput = scanner.nextLine();
        scanner.close();

        userInput = userInput.replace(" ", "");
        try {
            numbers = userInput.split(";");
        }catch(Exception e) {
            System.out.println("Syntax error please try again!");
            exit(0);
        }

        System.out.print("Die eingegebenen Noten lauten:");
        for (int x = 0; x < numbers.length; x++) {
            System.out.print(" " + numbers[x]);
        }
        double durchschnitt = 0;

        for(int x = 0; x < numbers.length; x++) {
            durchschnitt += Integer.parseInt(numbers[x]);
        }
        durchschnitt = durchschnitt / numbers.length;
        System.out.println("\nDer Notendurchschnitt lautet: " + durchschnitt);


    }

}

