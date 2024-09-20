package Arbeitsblatt_2;

public class TürmeVonHanoi {

    static int numberOfPieces = 20;

    static int[][] towers = new int[3][numberOfPieces];

    static int numberOfMoves = 0;

    public static void main(String[] args) {
        init();
        
        hanoi(numberOfPieces, 0, 1, 2);

        System.out.println(numberOfMoves);
    }

    private static void init(){
        for (int i = 0; i < numberOfPieces; i++) {
            towers[0][i] = numberOfPieces - i;
            for (int x = 1; x < 3; x++) {
                towers[x][i] = 0;
            }
        }
    }

    private static void hanoi(int i, int a, int b, int c) {
        if (i > 0) {
            hanoi(i - 1, a, c, b);
            move(a, c);
            hanoi(i - 1, b, a, c);
        }
    }

    private static void move(int a, int c) {
        int pieceToMove = 0;
        for (int x = numberOfPieces - 1; x >= 0; x--) {
            int piece = towers[a][x];

            if (piece != 0) {
                pieceToMove = piece;
                towers[a][x] = 0;
                break;
            }

        }

        for (int x = numberOfPieces - 1; x >= 0; x--) {
            int piece = towers[c][x];

            if (piece != 0) {
                towers[c][x + 1] = pieceToMove;
                break;
            } else if(x == 0) {
                towers[c][x] = pieceToMove;
            }

        }

        print();
        numberOfMoves ++;

    }

    private static void print(){
        for (int i = numberOfPieces - 1; i >= 0; i --) {
            for (int x = 0; x < 3; x++) {
                int piece = towers[x][i];
                System.out.print("   " + piece + "   ");
            }
            System.out.println();
        }
        System.out.println();
    }
}