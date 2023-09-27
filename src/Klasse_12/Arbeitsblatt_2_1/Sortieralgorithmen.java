package Klasse_12.Arbeitsblatt_2_1;

import java.util.Scanner;

public class Sortieralgorithmen {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        bubblesort();
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
        
    }
}
