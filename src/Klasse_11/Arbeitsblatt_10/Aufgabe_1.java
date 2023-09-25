package Arbeitsblatt_10;

import java.util.Scanner;

public class Aufgabe_1 {
    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);

        System.out.print("Geben Sie eine Note ein: ");

        int note = tastatur.nextInt();

        switch(note) {
            case 1:
                System.out.println("Sehr Gut!");
                break;
            case 2:
                System.out.println("Gut!");
                break;
            case 3:
                System.out.println("Befridigend");
                break;
            case 4:
                System.out.println("Ausreichend");
                break;
            case 5:
                System.out.println("Mangelhaft");
                break;
            case 6:
                System.out.println("Ungenügend!");
                break;
            default:
                System.out.println("Fehlerhafte Eingabe bitte versuchen sie es Erneut!");
        }

    }
}
