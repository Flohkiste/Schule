package Arbeitsblatt_16;

import java.util.Scanner;

public class Aufgabe_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wie viele Elemente sollen es sein: ");
        int arrayLength = scanner.nextInt();

        int[] array = new int[arrayLength];

        for(int x = 0; x < arrayLength; x++) {
            int y = scanner.nextInt();
            array[x] = y;
        }

        System.out.print("Die eingegebenen Zahlen lauten:");
        for (int x = 0; x < array.length; x++) {
            System.out.print(" " + array[x]);
        }

        System.out.println("\nDie größte davon ist: " + getLargest(array));
        scanner.close();


    }

    public static int getLargest(int[] a){
        int total = a.length;
        int temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total-1];
    }

}

