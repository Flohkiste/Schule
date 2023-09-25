import java.util.Scanner;

public class Aufgabe_3 {
    public static Scanner sc;
    public static void main(String[] args){
        sc = new Scanner(System.in);
        System.out.print("Gib deinen Namen ein: ");
        String name = sc.nextLine();
        
        hallo(name);
        potenz();
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
            System.out.println(Math.random());
        }
    }

    public static void 


}