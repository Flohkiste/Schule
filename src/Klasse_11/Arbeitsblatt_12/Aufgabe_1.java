package Arbeitsblatt_12;

public class Aufgabe_1 {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        int z = 0;

        while(x<=10) {
            z = 0;
            y = 1;
            while(y<=10) {
                System.out.print(z += x);
                System.out.print(" ");
                y += 1;
            }

            x += 1;
            System.out.println();
        }


    }
}
