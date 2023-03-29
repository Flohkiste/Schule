package Arbeitsblatt_11;

public class Aufgabe_6 {
    public static void main(String[] args) {
        for(int i = -20; i <= 20; i++) {
            System.out.print(i + " | ");
        }

        System.out.println();

        for(int i = -20; i <= 20; i++) {

            double f = 8 * Math.pow(i, 2) - 4 * i + 6;
            System.out.print(f + " | ");
        }

    }
}
