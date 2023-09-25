package Arbeitsblatt_14;

import java.util.Scanner;

public class Aufgabe_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String SpecialCharacters = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
        String upperCaseCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String LowerCaseCharacters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "1234567890";

        System.out.print("Bitte geben Sie ihr Passwort ein: ");
        String password = scanner.nextLine();
        scanner.close();

        if(lenght(password) & checkfor(password, SpecialCharacters) & checkfor(password, upperCaseCharacters) & checkfor(password, LowerCaseCharacters) & checkfor(password, numbers)){
            System.out.println("Ihr Passwort ist sicher!");
        }else {
            System.out.println("Ihr Passwort ist unsicher Sie sollten sich ein neues ausdenken");
        }

    }
   
    private static boolean checkfor(String stringToBeChecked, String charactersToCheckfor) {
        for (int i=0; i < stringToBeChecked.length() ; i++) {
            char ch = stringToBeChecked.charAt(i);
            if(charactersToCheckfor.contains(Character.toString(ch))) {
                return true;
            }
            else if(i == stringToBeChecked.length()-1)
                return false;
        }
        return false;
    }

    private static boolean lenght(String stringToBeChecked) {
    if(stringToBeChecked.length() >= 10) {
        return true;
    } else {
        return false;
    }
    }
}