package Arbeitsblatt_3;


public class Aufgabe_3 {
    public static void main(String[] args) {
        String wort = "Otto";
        if (istPalindrom(wort)){
            System.out.println(wort + " ist ein Palindrom!");
        } else {
            System.out.println(wort + " ist kein Palindrom!");
        }
    }

    public static boolean istPalindrom(String wort) {
        if (wort.equalsIgnoreCase(reverse(wort))) {
            return true;
        } else {
            return false;
        }
    }

    public static String reverse(String wort) {
        if (wort.isEmpty()) {
            return wort;
        }
        return reverse(wort.substring(1)) + wort.charAt(0);
    }
}