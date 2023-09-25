import java.util.Scanner;

public class Aufgabe_2 {
    public static Scanner sc;
    public static String name;

    public static void main(String[] args){
        sc = new Scanner(System.in);

        hallo();
        summe();
        cube();
        System.out.println("Tschüss " + name);
        vorhersage();


    }
    
    public static void summe(){
        System.out.println("Gib zwei Zahlen a und b ein: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Die Summe der Zahlen lautet: " + (a + b));
    }

    public static void cube(){
        System.out.print("Gib eine Zahl ein: ");
        int c = sc.nextInt();
        System.out.println("Das Kubik der Zahl lautet: " + (c * c * c));
    }

    public static void hallo(){
        name = "Petra";
        System.out.println("Hallo " + name);
    }

    public static void vorhersage(){
        double zufallszahl = Math.round( Math.random() )  ;
        if (zufallszahl == 1){
            System.out.println("Es ist falsch!");
        }else{
            System.out.println("Es ist wahr");
        }

    }

}
