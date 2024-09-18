package Arbeitsblatt_2;

public class TürmeVonHanoi {

    static int numberOfPieces = 5;

    static int[][] towers = new int[3][numberOfPieces];

    public static void main(String[] args) {
        init();

        print();
        hanoi(1, 1, 2);
    }

    private static void init(){
        for (int i = 0; i < numberOfPieces; i++) {
            towers[0][i] = numberOfPieces - i;
            for (int x = 1; x < 3; x++) {
                towers[x][i] = 0;
            }
        }
    }

    private static void hanoi(int pieceToMove, int targetTower, int memory) {
        for (int i = 0; i < 3; i++) {
            if (towers[i][numberOfPieces-1] == pieceToMove){
                towers[i][numberOfPieces-1] = 0;
                towers[targetTower][numberOfPieces-1] = pieceToMove;
                print();
                break;
            }
        }
    }

    private static void move(int currentTower, int targetTower) {
        
    }

    private static void print(){
        for (int i = numberOfPieces - 1; i >= 0; i --) {
            for (int x = 0; x < 3; x++) {
                int piece = towers[x][i];
                System.out.print(" " + piece + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}