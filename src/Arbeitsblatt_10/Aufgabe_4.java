package Arbeitsblatt_10;

import java.util.Scanner;

public class Aufgabe_4 {
    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);

        System.out.print("Bitte geben sie die aktuelle Stunde ein: ");
        int time = tastatur.nextInt();

        if(time == 7) {
            System.out.println("Das Ticket kostet aktuell 28€");
        }else if(time == 8) {
            System.out.println("Das Ticket kostet aktuell 28,50€");
        }else if(time == 9) {
            System.out.println("Das Ticket kostet aktuell 39€");
        }else if(time == 10) {
            System.out.println("Das Ticket kostet aktuell 70€");
        }else if(time == 11) {
            System.out.println("Das Ticket kostet aktuell 120,50€");
        }else {
            System.out.println("Shop geschlossen!");
        }

    }
}
