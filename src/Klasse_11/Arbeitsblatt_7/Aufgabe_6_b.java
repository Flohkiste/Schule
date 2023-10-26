package Arbeitsblatt_7;

import java.util.Scanner;

public class Aufgabe_6_b {
    public static void main(String[] args) {
        double umsatz;
        double provision;
        Scanner tastatur = new Scanner(System.in);

        System.out.print("Bitte geben Sie ihren Umsatz ein: ");
        umsatz = tastatur.nextDouble();

        if (umsatz > 10000) {
            provision = umsatz * 0.1;
            System.out.println("Sie machen einen Umsatz von " + umsatz + " und bekommen deswegen eine Provision von " + provision);
        }
        else {
            System.out.println("Sie erhalten keine Provision! Du Geringverdiener");
        }

        tastatur.close();
    }
}
