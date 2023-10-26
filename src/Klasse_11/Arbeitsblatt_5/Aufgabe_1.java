package Arbeitsblatt_5;

import java.util.Scanner;

public class Aufgabe_1 {
    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);
        System.out.print("Ihr Name: ");
        String name = tastatur.next();
        System.out.print("Ihr Alter: ");
        int alter = tastatur.nextInt();
        System.out.println("Sie sind " + alter + " Jahre alt und heißen " + name + "!");

        tastatur.close();
    }   
}
