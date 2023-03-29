package Arbeitsplatt_7;

import java.util.Scanner;

public class Aufgabe_7 {
    private static boolean winter(String monat) {
        String[] winter = {"Dezember", "Januar", "Februar"};


        for(String winterMonat : winter) {
            if (monat.equalsIgnoreCase(winterMonat)){
                return true;
            }
        }
        return false;

    }


    private static boolean frühling(String monat) {
        String[] frühling = {"März", "April", "Mai", "Juni"};

        for(String frühlingMonat : frühling) {
            if (frühlingMonat.equalsIgnoreCase(monat)){
                return true;
            }
        }

        return false;
    }


    private static boolean sommer(String monat) {
        String[] sommer = {"Juli", "August", "September"};

        for(String sommerMonat : sommer)
            if (sommerMonat.equalsIgnoreCase(monat)){
                return true;
            }

        return false;
    }


    private static boolean herbst(String monat) {
        String[] herbst = {"Oktober", "November"};

        for(String herbstMonat : herbst)
            if (herbstMonat.equalsIgnoreCase(monat)){
                return true;
            }

        return false;
    }




    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);
        String monat;

        System.out.print("Bitte geben Sie den aktuellen Monat ein: ");
        monat = tastatur.next();

        if (winter(monat)) {
            System.out.println("Es ist Winter!");
        }
        else if(frühling(monat)) {
            System.out.println("Es ist Frühling!");
        }
        else if(sommer(monat)) {
            System.out.println("Es ist Sommer!");
        }
        else if(herbst(monat)) {
            System.out.println("Es ist Herbst!");
        }
        else {
            System.out.println("Ungültige Eingabe!!!");
        }


    }
}
