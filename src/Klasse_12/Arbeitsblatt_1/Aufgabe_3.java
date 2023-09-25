import java.util.Random;
import java.util.Scanner;

public class Aufgabe_3 {
    public static Scanner sc;
    public static Random random = new Random();
    public static void main(String[] args){
        sc = new Scanner(System.in);
        System.out.print("Gib deinen Namen ein: ");
        String name = sc.nextLine();
        
        hallo(name);
        potenz();
        zufallszahlen(10);
        teiler(10);
        mittelwert();
    }

    public static void hallo(String name){
        System.out.println("Hallo " + name);
    }

    public static void potenz(){
        System.out.print("Gib eine Zahl ein: ");
        int a = sc.nextInt();
        System.out.print("Gib eine Potenz ein: ");
        int b = sc.nextInt();
        System.out.println("Die Potenz lautet: " + Math.pow(a, b));
    }

    public static void zufallszahlen(int anzahl){
        for (int i = 0; i < anzahl; i++){
            System.out.println(random.nextInt());
        }
    }

    public static void teiler(int zahl){
        for (int i = 1; i <= zahl; i++){
            if (zahl % i == 0){
                System.out.println(i);
            }
        }
    }
 
    //Schreibe eine Methode welche den Mittelwert einer Menge von Zahlen berechnet und ausgibt.
    public static void mittelwert(){
        System.out.print("Gib die Anzahl der Zahlen ein: ");
        int anzahl = sc.nextInt();
        int summe = 0;
        for (int i = 0; i < anzahl; i++){
            System.out.print("Gib eine Zahl ein: ");
            summe += sc.nextInt();
        }
        System.out.println("Der Mittelwert lautet: " + (summe / anzahl));
    }
}