package Klasse_12.Software.Arbeitsblatt_2_2;

public class Aufgabe_1 {
    public static void main(String[] args){
        char letter = '2';
        System.out.println("wert: " + distanceOf(5.7, 4.6));
        System.out.println(isLetter(letter));
        System.out.println("Volumen: " + zylinderVolumen(10, 10));
    }

    public static double distanceOf(double Wert1, double Wert2){
        return Math.abs(Wert1 - Wert2);
    }

    public static boolean isLetter(char letterToCheck){
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        for(int x = 0; x < letters.length(); x++){
            if(letterToCheck == letters.charAt(x)){
                return true;
            }
        }
        return false;
    }

    public static double zylinderVolumen(double radius, double hoehe){
        double ergebnis = Math.PI * Math.pow(radius, 2) * hoehe;
        return ergebnis;
    }
}
