package Klasse_12.Arbeitsblatt_2_1;

import java.util.Scanner;

public class Sortieralgorithmen {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("1. Bubblesort");
        System.out.println("2. Insertion Algorithmus");
        System.out.println("3. Selection Sort Algorithmus");
        System.out.println("4. Bubblesort Zwischenschritte");
        System.out.println("5. Programm beenden");
        System.out.print("Bitte wählen Sie: ");
        int auswahl = sc.nextInt();

        switch(auswahl){
            case 1:
                bubblesort();
                break;
            case 2:
                insertionAlgorithmus();
                break;
            case 3:
                selectionSortAlgorithmus();
                break;
            case 4:
                bubblesortZwischenschritte();
                break;
            case 5:
                System.out.println("Programm wird beendet");
                break;
            default:
                System.out.println("Falsche Eingabe");
                break;
        }
    }


    public static void bubblesort(){
        boolean fertig;
        int j;
        int anz;
        int zahl;
        System.out.print("Bitte geben Sie die Anzahl der Zahlen ein: ");
        anz = sc.nextInt();

        int[] feld = new int[anz];

        for(int i = 0; i < anz; i++){
            System.out.print("Bitte geben Sie die " + (i + 1) + ". Zahl ein: ");
            feld[i] = sc.nextInt();
        }

        fertig = false;
        j = anz - 2;

        while(!fertig){
            fertig = true;
            for(int i = 0; i <= j; i++){
                if(feld[i] > feld[i + 1]){
                    zahl = feld[i];
                    feld[i] = feld[i + 1];
                    feld[i + 1] = zahl;
                    fertig = false;
                    


                }
            }
            j--;
        }

        for(int i = 0; i < anz; i++){
            System.out.print(feld[i] + " ");
        }
        System.out.println();

    }

    public static void insertionAlgorithmus(){
        int einzufuegen;
        int index;
        System.out.print("Bitte geben Sie die Anzahl der Zahlen ein: ");
        int[] daten = new int[sc.nextInt()];

        for(int i = 0; i < daten.length; i++){
            System.out.print("Bitte geben Sie die " + (i + 1) + ". Zahl ein: ");
            daten[i] = sc.nextInt();
        }

        for(int i = 0; i < (daten.length - 1); i++){
            einzufuegen = daten[i];
            index = i;
            while(index > 0 && daten[index - 1] > einzufuegen){
                daten[index] = daten[index - 1];
                index--;
            }
            daten[index] = einzufuegen;
        }

        
        for(int i = 0; i < daten.length; i++){
            System.out.print(daten[i] + " ");
        }
        System.out.println();

    }

    public static void selectionSortAlgorithmus(){
        int min;
        int speicher;
        System.out.print("Bitte geben Sie die Anzahl der Zahlen ein: ");
        int[] zahlen = new int[sc.nextInt()];

        for(int i = 0; i < zahlen.length; i++){
            System.out.print("Bitte geben Sie die " + (i + 1) + ". Zahl ein: ");
            zahlen[i] = sc.nextInt();
        }

        for(int j = 0; j < zahlen.length - 1; j++){
            min = j;
            for(int i = j + 1; i < zahlen.length; i++){
                if(zahlen[i] < zahlen[min]){
                    min = i;
                }
            }
            speicher = zahlen[j];
            zahlen[j] = zahlen[min];
            zahlen[min] = speicher;
        }

        for(int i = 0; i < zahlen.length; i++){
            System.out.print(zahlen[i] + " ");
        }
        System.out.println();
    }

        public static void bubblesortZwischenschritte(){
        boolean fertig;
        int j;
        int anz;
        int zahl;
        System.out.print("Bitte geben Sie die Anzahl der Zahlen ein: ");
        anz = sc.nextInt();

        int[] feld = new int[anz];

        for(int i = 0; i < anz; i++){
            System.out.print("Bitte geben Sie die " + (i + 1) + ". Zahl ein: ");
            feld[i] = sc.nextInt();
        }

        fertig = false;
        j = anz - 2;

        while(!fertig){
            fertig = true;
            for(int i = 0; i <= j; i++){
                if(feld[i] > feld[i + 1]){
                    zahl = feld[i];
                    feld[i] = feld[i + 1];
                    feld[i + 1] = zahl;
                    fertig = false;
                    
                    for(int k = 0; k < anz; k++){
                        System.out.print(feld[k] + " | ");
                    }
                    System.out.println();

                }
            }
            j--;
        }

        for(int i = 0; i < anz; i++){
            System.out.print(feld[i] + " ");
        }
        System.out.println();

    }
}
