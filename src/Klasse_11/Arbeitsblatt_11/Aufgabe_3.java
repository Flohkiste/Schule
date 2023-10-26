package Arbeitsblatt_11;

import java.util.Scanner;

public class Aufgabe_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x;
        int n = 0;
        boolean z = true;

        System.out.print("Bitte geben sie die Basis ein: ");
        x = scanner.nextDouble();


        while(z){
            System.out.print("Bitte geben sie den Exponent ein: ");
            n = scanner.nextInt();
            if(n >= 0) {
                break;
            }else {
                System.out.println("Bitte geben Sie als Exponent eine natürliche Zahl ein!");
            }
        }




        System.out.println(Math.pow(x, n));
        scanner.close();


    }
}
