package Arbeitsblatt_11;

public class Aufgabe_8 {
    public static void main(String[] args) {

        for(int i = 0; i < 8; i++) {
            for(int y = 1; y < 9; y++){
                if(i+y<10) {
                    System.out.print("   ");
                }else {
                    System.out.print("  ");
                }

                System.out.print(i+y);
            }
            System.out.println();
        }

    }
}
