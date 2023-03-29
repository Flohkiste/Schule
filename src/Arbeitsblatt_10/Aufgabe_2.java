package Arbeitsblatt_10;

import java.util.Scanner;

public class Aufgabe_2 {
    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);
        double volumen;
        double oberflaeche;
        double hoehe;
        double radius;
        double laenge;
        double breite;

        System.out.print("Bitte waehlen Sie: (Z)ylinder, (W)ürfel, (Q)uader oder (K)reiskegel.\nIhre Wahl: ");
        String körper = tastatur.next();

        switch(körper) {
            case "Z":
                System.out.print("Bitte geben Sie den Radius ihrers Zylinders ein: ");
                radius = tastatur.nextDouble();
                System.out.print("Bitte geben Sie die Höhe ihres Zylinders ein: ");
                hoehe = tastatur.nextDouble();

                volumen = Math.PI * Math.pow(radius, 2) * hoehe;
                oberflaeche = 2 * Math.PI * Math.pow(radius, 2) + 2 * Math.PI * radius * hoehe;

                System.out.println("Zylinder Oberflaeche: " + oberflaeche);
                System.out.println("Zylinder Volumen: " + volumen);
                break;

            case "W":
                System.out.print("Bitte geben Sie den Kantenlaenge ihrers Würfels ein: ");
                double kantenlaenge = tastatur.nextDouble();

                volumen = Math.pow(kantenlaenge, 3);
                oberflaeche = Math.pow(kantenlaenge, 2) * 6;

                System.out.println("Würfel Oberflaeche: " + oberflaeche);
                System.out.println("Würfel Volumen: " + volumen);
                break;

            case "Q":
                System.out.print("Bitte geben Sie die Laenge ihrers Zylinders ein: ");
                laenge = tastatur.nextDouble();
                System.out.print("Bitte geben Sie die Breite ihres Zylinders ein: ");
                breite = tastatur.nextDouble();
                System.out.print("Bitte geben Sie die Höhe ihres Zylinders ein: ");
                hoehe = tastatur.nextDouble();

                volumen = laenge * breite * hoehe;
                oberflaeche = 2 * laenge * breite + 2 * laenge * hoehe + 2 * breite * hoehe;

                System.out.println("Quader Oberflaeche: " + oberflaeche);
                System.out.println("Quader Volumen: " + volumen);
                break;

            case "K":
                System.out.print("Bitte geben Sie den Radius ihrers Kreiskegels ein: ");
                radius = tastatur.nextDouble();
                System.out.print("Bitte geben Sie die Höhe ihres Kreiskegels ein: ");
                hoehe = tastatur.nextDouble();

                double grundflaeche = Math.PI * Math.pow(radius, 2);
                volumen = (1 / 3) * grundflaeche * hoehe;
                double s = Math.sqrt(Math.pow(hoehe, 2) + Math.pow(radius, 2));
                oberflaeche = radius * Math.PI * (radius + s);

                System.out.println("Kreiskegel Oberflaeche: " + oberflaeche);
                System.out.println("Kreiskegel Volumen: " + volumen);
                break;
        }
    }
}
