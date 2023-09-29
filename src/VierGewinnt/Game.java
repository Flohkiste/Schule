package VierGewinnt;

public class Game {

    private int[][] board = new int[6][7];
    private int currentPlayer = 1;

    public Game() {
        // Setting all values in the array to zero
        for (int x = 0; x < 6; x++) {
            for (int y = 0; y < 7; y++) {
                board[x][y] = 0;
            }
        }

        

        drawBoard();
    }

    private void gameLoop() {

    }

    public void drawBoard() {
        System.out.println(
                "-------------------------------\n|| 1 | 2 | 3 | 4 | 5 | 6 | 7 ||\n-------------------------------");
        for (int x = 0; x < 6; x++) {
            System.out.print("||");
            for (int y = 0; y < 7; y++) {
                if (this.board[x][y] == 0) {
                    System.out.print(" O ");
                } else if (this.board[x][y] == 1) {
                    System.out.print(" \u001B[31mX\u001B[0m ");
                }
                System.out.print("|");
            }
            System.out.println("|");
        }
    }

    public void makeMove(){
        
    }

}
