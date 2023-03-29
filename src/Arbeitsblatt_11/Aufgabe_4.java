package Arbeitsblatt_11;

public class Aufgabe_4 {	public static void main(String[] args) {
    System.out.println("Das kleine 1x1!");
    System.out.println("-------------------------------------------------------------------------------");

    for(int i = 1; i <= 10; i++) {
        for(int x = i; x <= (i*10); x = x + i) {
            if(x >= 100) {
                System.out.print("  " + x);
            }else if(x >= 10) {
                System.out.print("   " + x);
            }else {
                System.out.print("    " + x);
            }
        }
        System.out.print("\n");

    }

}

}
