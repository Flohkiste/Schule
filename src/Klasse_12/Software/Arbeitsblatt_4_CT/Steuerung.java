package Klasse_12.Software.Arbeitsblatt_4_CT;

import java.util.Scanner;

public class Steuerung {

    static int index = 0;
    static Kontakt kontakte[] = new Kontakt[20];

    public static void main(String[] args){

        for(Kontakt kontakt : kontakte){
            kontakt = new Kontakt();
        }




    }

    public static void setKontakt(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie folgende Daten ein:");

        System.out.print("Vorname: ");
        kontakte[index].setVorname(scanner.next());

        System.out.print("Nachname: ");
        kontakte[index].setNachname(scanner.next());

        System.out.print("Strasse: ");
        kontakte[index].setStrasse(scanner.next());
        
        System.out.print("Hausnummer: ");
        kontakte[index].setHausnummer(scanner.next());

        System.out.print("Wohnort: ");
        kontakte[index].setWohnort(scanner.next());

        System.out.print("PLZ: ");
        kontakte[index].setPlz(scanner.next());

        index ++;
    }
}
