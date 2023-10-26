package Arbeitsblatt_5;

import java.util.Scanner;

public class Aufgabe_5 {
    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);
        System.out.print("Bitte geben Sie Ihren Name und Vorname ein: ");
        String Name = tastatur.nextLine();
        System.out.print("Bitte geben Sie Ihr Alter ein: ");
        int alter = tastatur.nextInt();
        int alterInTagen = alter * 365;
        System.out.println("Hallo " + Name + " du bist " + alterInTagen + " Tage alt");

        tastatur.close();
    }
}
