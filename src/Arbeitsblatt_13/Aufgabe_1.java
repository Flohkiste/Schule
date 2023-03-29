package Arbeitsblatt_13;

import java.util.Scanner;

public class Aufgabe_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double userinput;
        int durchläufe = 0;
        double summe = 0;

        do {
            System.out.print("Gib eine Zahl ein (Beenden mit 0): ");
            userinput = scanner.nextDouble();
            summe += userinput;
            durchläufe += 1;
        } while (userinput != 0);

        durchläufe -= 1;

        System.out.println("Summe: " + summe + "; Durchschnitt: " + summe / durchläufe);

    }
}
