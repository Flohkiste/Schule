package Arbeitsblatt_14;

import java.util.Scanner;

public class Aufgabe_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie ihren Satz ein: ");
        String sentence = scanner.nextLine();

        sentence = sentence.replace("a", "");
        sentence = sentence.replace("A", "");
        sentence = sentence.replace("e", "");
        sentence = sentence.replace("E", "");
        sentence = sentence.replace("i", "");
        sentence = sentence.replace("I", "");
        sentence = sentence.replace("o", "");
        sentence = sentence.replace("O", "");
        sentence = sentence.replace("u", "");
        sentence = sentence.replace("U", "");
        System.out.println(sentence);
        scanner.close();
    }
}
