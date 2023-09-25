package Arbeitsblatt_17;

public class Aufgabe_3 {
    public static void main(String[] args){
        String[][] coords = new String[][]{{"0-0", "0-1", "0-2", "0-3", "0-4"}, {"1-0", "1-1", "1-2", "1-3", "1-4"}, {"2-0", "2-1", "2-2", "2-3", "2-4"}, {"3-0", "3-1", "3-2", "3-3", "3-4"}, {"4-0", "4-1", "4-2", "4-3", "4-4"}};

        System.out.println("               Spalte 0    Spalte 1    Spalte 2    Spalte 3    Spalte 4");
        for(int x = 0; x < 5; x++){
            System.out.print("Zeile: " + x);
            for(int y = 0; y < 5; y++){
                System.out.print("         " + coords[x][y]);
            }
            System.out.println();
        }
    }
}
