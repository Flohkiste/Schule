package Klasse_12.Software.Arbeitsblatt_4_CT;

import java.util.Scanner;

public class Steuerung {

    static int index = 0;
    static Kontakt kontakte[] = new Kontakt[20];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        for(int i = 0; i < 20; i++){
            kontakte[i] = new Kontakt();
        }

        while (true) {
            System.out.println();
            System.out.println("Dieses Programm realisiert eine Kontaktverwaltung.");
            System.out.println("Zum beenden des Programms drücken sie (3).");
            System.out.println("Möchten Sie Termine speichern (1) oder ausgeben (2)?");

            int eingabe = scanner.nextInt();

            if (eingabe == 1) {
                if(index < 20){
                    setKontakt();
                }else{
                    System.out.println("Liste Voll!!");
                }
            }else if (eingabe == 2) {
                System.out.println("Welcher Datensatz soll ausgegeben werden? (1-20)");
                eingabe = scanner.nextInt();
                kontakte[eingabe - 1].ausgabe();
            }else if(eingabe == 3){
                break;
            }else{
                System.out.println("Falsche eingabe!!");
            }
        }




    }

    public static void setKontakt(){

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

        System.out.print("Kommentar: ");
        kontakte[index].setKommentar(scanner.next());

        index ++;
    }
}
