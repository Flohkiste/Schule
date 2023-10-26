package Arbeitsblatt_7;

import java.util.Scanner;

public class Aufgabe_6 {
    public static void main(String[] args) {
        double aSeite;
        double bSeite;
        double cSeite;
        Scanner tastatur = new Scanner(System.in);

        System.out.println("Bitte geben sie die Länge der A Seite ein:");
        aSeite = tastatur.nextDouble();
        System.out.println("Bitte geben sie die Länge der B Seite ein:");
        bSeite = tastatur.nextDouble();
        System.out.println("Bitte geben sie die Länge der C Seite ein:");
        cSeite = tastatur.nextDouble();

        if (((aSeite + bSeite) > cSeite) & ((bSeite + cSeite) > aSeite) & ((cSeite + aSeite) > bSeite)) {
            System.out.println("Das Dreieck lässt sich konstruieren.");
        }
        else {
            System.out.println("Das Dreieck lässt sich nicht konstruieren.");
        }

        tastatur.close();
    }
}
