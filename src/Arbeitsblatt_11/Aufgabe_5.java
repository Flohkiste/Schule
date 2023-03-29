package Arbeitsblatt_11;

import java.util.Scanner;

public class Aufgabe_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stars = 1;

        System.out.print("Gib die Anzahl der Zeilen ein: ");
        int rows = scanner.nextInt();

        for(int i = 0; i < rows; i++) {
            if(i==0) {
                stars = 1;
            }else {
                stars = 2 * i + 1;
            }

            int spaces = (((rows*2)-1) - stars) / 2;

            while(spaces > 0) {
                System.out.print(" ");
                spaces -=1;
            }
            while(stars > 0) {
                System.out.print("*");
                stars -= 1;
            }
            while(spaces > 0) {
                System.out.print(" ");
                spaces -=1;
            }

            System.out.println();

        }




        int spaces = (((rows*2)-1) - 1) / 2;

        while(spaces > 0) {
            System.out.print(" ");
            spaces -=1;
        }

        System.out.print("I");

        while(spaces > 0) {
            System.out.print(" ");
            spaces -=1;
        }



    }

}
