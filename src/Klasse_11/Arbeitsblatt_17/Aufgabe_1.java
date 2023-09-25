package Arbeitsblatt_17;

public class Aufgabe_1 {
    public static void main(String[] args){
        int[][] boats;
        boats = new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        for(int x = 0; x < 4; x++){
            for(int y = 0; y < 4; y++){
                System.out.print(boats[x][y] + "  ");
            }
            System.out.println();
        }
        System.out.println("\n\n\n");

        boats = new int[][]{{1, 1, 0, 0}, {0, 0, 0, 1}, {0, 1, 0, 1}, {0, 0, 0, 1}};

        for(int x = 0; x < 4; x++){
            for(int y = 0; y < 4; y++){
                System.out.print(boats[x][y] + "  ");
            }
            System.out.println();
        }

    }

}
