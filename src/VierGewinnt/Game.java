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
        this.board[5][3] = 2;
        drawBoard();

        makeMove(currentPlayer, 3);
    }

    public void gameLoop() {
    }

    public void drawBoard() {
        // clear the console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println(
                "-------------------------------\n|| 1 | 2 | 3 | 4 | 5 | 6 | 7 ||\n-------------------------------");
        for (int x = 0; x < 6; x++) {
            System.out.print("||");
            for (int y = 0; y < 7; y++) {
                if (this.board[x][y] == 0) {
                    System.out.print("   ");
                } else if (this.board[x][y] == 1) {
                    System.out.print(" \u001B[31mX\u001B[0m ");
                } else if (this.board[x][y] == 2) {
                    System.out.print(" \u001B[34mX\u001B[0m ");
                }
                System.out.print("|");
            }
            System.out.println("|");
        }
    }

    public void makeMove(int player, int column) {
        for (int x = 0; x < 6; x++) {
            if (this.board[x][column] != 0) {
                this.board[x - 1][column] = player;
                drawBoard();
                break;
            }
            this.board[x][column] = player;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            if (x != 0) {
                this.board[x - 1][column] = 0;
            }
            drawBoard();
        }
    }

}
