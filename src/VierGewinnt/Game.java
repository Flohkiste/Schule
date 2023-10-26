package VierGewinnt;

import java.util.Scanner;

public class Game {

    private Scanner sc = new Scanner(System.in);
    private int[][] board = new int[6][7]; // board[row][column]
    private int currentPlayer = 1;

    public Game() {
        for (int x = 0; x < 6; x++) {
            for (int y = 0; y < 7; y++) {
                board[x][y] = 0;
            }
        }
    }

    public void startGame(){
        drawBoard();
        gameLoop();
    }

    public void gameLoop() {

        while (true) {

            makeMove(currentPlayer);

            if (checkWin()) {
                System.out.println("Player " + currentPlayer + " won!");
                break;
            }
            if (checkDraw()) {
                System.out.println("Draw!");
                break;
            }

            if (currentPlayer == 1) {
                currentPlayer = 2;
            } else {
                currentPlayer = 1;
            }
        }
    }

    public void drawBoard() {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("\u001B[31mPlayer1: X\u001B[0m           \u001B[34mPlayer2: X\u001B[0m");
        System.out.println(
                "-------------------------------\n|| 1 | 2 | 3 | 4 | 5 | 6 | 7 ||\n-------------------------------");
        for (int x = 0; x < 6; x++) {
            System.out.print("||");
            for (int y = 0; y < 7; y++) {
                if (this.board[x][y] == 0) {
                    System.out.print(" O ");
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

    public void makeMove(int player) {
        int column = getColumn();
        for (int x = 0; x < 6; x++) {
            if (this.board[x][column] != 0) {
                this.board[x - 1][column] = player;
                drawBoard();
                break;
            }
            this.board[x][column] = player;

            if (x != 0) {
                this.board[x - 1][column] = 0;
            }
            drawBoard();

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int getColumn() {
        int x;
        while (true) {
            System.out.print("Player " + currentPlayer + " please enter a column: ");
            x = sc.nextInt();
            x--;
            if ((x >= 0 && x <= 6) && this.board[0][x] == 0) {
                break;
            } else {
                drawBoard();
                System.out.println("\u001B[31mInvalid input!Please try again!\u001B[0m");
            }
        }

        return x;
    }

    private boolean checkDraw() {
        return false;
    }

    private boolean checkWin() {
        if (checkWinRow() | checkWinColumn() | checkWinDiagonal()) {
            return true;
        }
        return false;
    }

    private boolean checkWinDiagonal(){
        if(checkWinDiagonalLeftToRight() | checkWinDiagonalRightToLeft()){
            return true;
        }else{
            return false;
        }
    }

    private boolean checkWinDiagonalRightToLeft(){
        int z = 0;
        int[] row = {2, 3, 4, 4, 4, 4};
        int[] column = {1, 1, 1, 2, 3, 4};
        int[] maxRuntimes = {3, 4, 5, 5, 4, 3};
        for(int x = 0; x < 6; x++){
            for(int y = 0; y < maxRuntimes[x]; y++){
                if ((this.board[(row[x] - y)][(column[x] + y)] != 0) && (this.board[(row[x] - y)][(column[x] + y)] == this.board[(row[x] - y + 1)][(column[x] + y - 1)])) {
                    z++;
                    if (z == 3) {
                        return true;
                    }
                } else {
                    z = 0;
                } 
            }
        }

        return false;
    }

    public boolean checkWinDiagonalLeftToRight() {
        int z = 0;
        int[] row = {3, 2, 1, 1, 1, 1};
        int[] column = {1, 1, 1, 2, 3, 4};
        int[] maxRuntimes = {3, 4, 5, 5, 4, 3};
        for(int x = 0; x < 6; x++){
            for(int y = 0; y < maxRuntimes[x]; y++){
                if ((this.board[(row[x] + y)][(column[x] + y)] != 0) && (this.board[(row[x] + y)][(column[x] + y)] == this.board[(row[x] + y - 1)][(column[x] + y - 1)])) {
                    z++;
                    if (z == 3) {
                        return true;
                    }
                } else {
                    z = 0;
                }
            }
            
        }
        return false;
    }

    private boolean checkWinColumn() { // board[row][column]
        int z = 0;

        for (int x = 0; x < 7; x++) {
            for (int y = 1; y < 6; y++) {
                if ((this.board[y][x] != 0) && (this.board[y][x] == this.board[y - 1][x])) {
                    z++;
                    if (z == 3) {
                        return true;
                    }
                } else {
                    z = 0;
                }
            }
        }

        return false;

    }

    private boolean checkWinRow() {
        int z = 0;
        for (int x = 0; x < 6; x++) {
            for (int y = 1; y < 7; y++) {
                if (this.board[x][y] != 0) {
                    if (this.board[x][y] == this.board[x][y - 1]) {
                        z++;
                        if (z == 3) {
                            return true;
                        }
                    }

                } else {
                    z = 0;
                }
            }
        }
        return false;

    }

}
