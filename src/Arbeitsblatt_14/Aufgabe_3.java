package Arbeitsblatt_14;

import java.util.Scanner;

public class Aufgabe_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie ihre Passwort ein: ");
        String password = scanner.nextLine();

        if(lenght(password) & specialCharacter(password) & upperCaseCharacters(password) & lowerCaseCharacters(password)){
            System.out.println("Ihr Passwort ist sicher!");
        }else {
            System.out.println("Ihr Passwort ist unsicher Sie sollten sich ein neues ausdenken");
        }

    }

    private static boolean lenght(String str){
        if(str.length() >= 10){
            return true;
        }else {
            return false;
        }
    }

    private static boolean specialCharacter(String str){
        String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
        for (int i=0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            if(specialCharactersString.contains(Character.toString(ch))) {
                return true;
            }
            else if(i == str.length()-1)
                return false;
        }
        return false;
    }

    private static boolean upperCaseCharacters(String str){
        String specialCharactersString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i=0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            if(specialCharactersString.contains(Character.toString(ch))) {
                return true;
            }
            else if(i == str.length()-1)
                return false;
        }
        return false;
    }

    private static boolean lowerCaseCharacters(String str){
        String specialCharactersString = "abcdefghijklmnopqrstuvwxyz";
        for (int i=0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            if(specialCharactersString.contains(Character.toString(ch))) {
                return true;
            }
            else if(i == str.length()-1)
                return false;
        }
        return false;
    }



}
