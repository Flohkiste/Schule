package Arbeitsblatt_10;

import java.util.Scanner;

public class Aufgabe_5 {
    private static String weekday(int day, int month, int year) {
        if(month <= 2) {
            month = month + 10;
            year--;
        }else {
            month = month - 2;
        }

        int c = year / 100;
        int y = year % 100;

        int h = (((26 * month-2)/10) + day + y + y / 4 + c / 4 - 2 * c) % 7;



        if(h < 0) {
            h += 7;
        }



        switch (h) {
            case 1:
                return "Montag";
            case 2:
                return "Dienstag";
            case 3:
                return "Mittwoch";
            case 4:
                return "Donnerstag";
            case 5:
                return "Freitag";
            case 6:
                return "Samstag";
            case 0:
                return "Sonntag";

            default:
                return "Fehler";
        }

    }





    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);

        System.out.print("Bitte geben sie den aktuellen Tag (1-31) ein: ");
        int day = tastatur.nextInt();

        System.out.print("Bitte geben sie den aktuellen Monat (1-12) ein: ");
        int month = tastatur.nextInt();

        System.out.print("Bitte geben sie das aktuelle Jahr ein: ");
        int year = tastatur.nextInt();

        System.out.println("Der " + day + "." + month + "." + year + " ist ein " + weekday(day, month, year));
        tastatur.close();
    }
}
