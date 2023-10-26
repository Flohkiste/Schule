package Arbeitsblatt_5;

import java.util.Scanner;

public class Aufgabe_4 {
    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);
        System.out.print("Bitte geben Sie Ihren Namen und Vornamen ein: ");
        String name = tastatur.nextLine();
        System.out.println("Guten Morgen Herr " + name + "!");

        tastatur.close();
    }
}
