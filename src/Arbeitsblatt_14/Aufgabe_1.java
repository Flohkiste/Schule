package Arbeitsblatt_14;

import java.util.Scanner;

public class Aufgabe_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie ihren Satz ein: ");
        String sentence = scanner.nextLine();

        sentence = sentence.replace('r', 'l');
        sentence = sentence.replace('R', 'L');
        System.out.println(sentence);
    }
}
