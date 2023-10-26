package Arbeitsblatt_14;

import java.util.Scanner;

public class Zusatzaufgabe {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean isPalindrom = false;

        System.out.print("Bitte geben Sie ihr Wort ein: ");
        String word = scanner.nextLine();
        String wordx = word.toLowerCase();
        wordx = wordx.replace(" ", "");

        for(int x = 0; x < wordx.length(); x++){
            if(wordx.charAt(x) == wordx.charAt(wordx.length()-x-1)){
                isPalindrom = true;
            } else {
                isPalindrom = false;
                break;
            }
        }

        if(isPalindrom){
            System.out.println(word + " ist ein Palindrom!");
        }else{
            System.out.println(word + " ist kein Palindrom!");
        }
        scanner.close();

    }
}
