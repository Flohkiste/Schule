package Arbeitsblatt_10;

import java.util.Scanner;

public class Zusatzaufgabe_Ostermontag {
    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);

        System.out.print("Bitte geben Sie das Jahr ein von dem Sie das Datum des Ostermontags wissen wollen (gültig vom Jahr 1 bis zum Jahr 8202): ");
        int year = tastatur.nextInt();

        int a = year % 19;
        int b = year % 4;
        int c = year % 7;

        int m = (8 * (year / 100) + 13) / 25 - 2;
        int s = year / 100 - year / 400 -2;
        m = (15 + s - m) % 30;
        int n = (6 + s) % 7;

        int d = (m + 19 * a) % 30;
        if(d == 29) {
            d = 28;
        }else if((d == 28) & a >= 11) {
            d = 27;
        }

        int e = (2 * b + 4 * c + 6 * d + n);

        int day = 21 + d + e + 1;
        int month;
        if(day > 31) {
            day = day % 31;
            month = 4;
        }else {
            month = 3;
        }

        System.out.println("Im Jahr " + year + " ist der Ostersonntag am " + day + "." + month + ".");
    }
}
