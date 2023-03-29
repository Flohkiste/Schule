package Arbeitsblatt_5;

import java.util.Scanner;

public class Aufgabe_3 {
    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);
        System.out.print("Gib die erste Zahl ein: ");
        double zahl1 = tastatur.nextDouble();
        System.out.print("Gib die zweite Zahl ein: ");
        double zahl2 = tastatur.nextDouble();
        double ergebnis;
        ergebnis = zahl1 / zahl2;
        System.out.println("Das Ergebniss: " + zahl1 + " / " + zahl2 + " = " + ergebnis);

    }
}
