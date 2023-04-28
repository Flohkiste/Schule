package Arbeitsblatt_16;


public class Aufgabe_3 {

    public static void main(String[] args) {
        int[] numbers = new int[100];

        for(int x = 0; x < 100; x++) {
            numbers[x] = x + 1;
        }

        int numberx = 0;
        for(int x = 0; x < 100; x++) {
            numberx += numbers[x];
            if((x + 1) % 10 == 0) {
                System.out.print(numberx + " ");
            }
        }

    }

}

