package Arbeitsblatt_10;

import java.util.Scanner;

public class Aufgabe_3 {
    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);

        System.out.print("Portoberechnung \nGewicht des Briefes in g: ");
        double weight = tastatur.nextDouble();

        if(weight <= 20) {
            System.out.println("Kosten: 1€");
        }else if(weight <= 50){
            System.out.println("Kosten: 1,70€");
        }else if(weight <= 100) {
            System.out.println("Kosten: 2,40€");
        }else if(weight <= 250) {
            System.out.println("Kosten: 3,20€");
        }else if(weight <= 500) {
            System.out.println("Kosten: 4,00€");
        }else if(weight <= 1000) {
            System.out.println("Kosten: 4,80€");
        }else {
            System.out.println("Sendungen schwerer als 1kg werden als Päckchen oder Paket verschickt!");
        }

        System.out.println("Programmende Brief!");
        tastatur.close();
    }
}
