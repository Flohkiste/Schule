package Arbeitsblatt_5;

import java.util.Scanner;

public class Aufgabe_2 {
    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);
        System.out.print("Bitte gib den Dividend ein: ");
        double dividend = tastatur.nextDouble();
        System.out.print("Bitte gib den Divisor ein: ");
        double divisor = tastatur.nextDouble();
        int ergebnis;
        int rest;
        System.out.println("Ganzzahlige Division mit Rest");
        System.out.println("Dividend: " + dividend);
        System.out.println("Divisor: " + divisor);
        ergebnis = (int) (dividend / divisor);
        rest = (int) (dividend % divisor);
        System.out.println("Das Ergebnis der Division " + dividend + " / " + divisor + " ist " + ergebnis + " der Rest ist " + rest);
        System.out.println("Programmende Ganzteil.");

    }
}
