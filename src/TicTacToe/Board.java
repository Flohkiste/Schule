package TicTacToe;

import java.util.Scanner;

public class Board {

    boolean currentPlayer = false;
    boolean gameRunning = true;
    int playerMove;
    Scanner scanner = new Scanner(System.in);

    String[] fields = { "1", "2", "3",
                        "4", "5", "6",
                        "7", "8", "9" };

    public void playerInput(){
        while (gameRunning){
            playerMove = scanner.nextInt();
            if(playerMove < 1 | playerMove > 9){
                System.out.println("Feld gibt es nicht, bitte Versuche es erneut mit einer Zahl zwischen 1 und 9!");
            } else {
                break;
            }
        }

        checkField();

    }

    public void checkField(){
        if(fields[playerMove-1].equals("X") | fields[playerMove-1].equals("O")){
            System.out.println("Feld schon belegt bitte wähl ein freies!");
            playerInput();
        }
    }


    public void gameLoop(){
        drawBoard();

        while (gameRunning){
            playerInput();
            makeTurn(playerMove-1);
            checkWin();
            drawBoard();
            if (currentPlayer){
                currentPlayer = false;
            } else {
                currentPlayer = true;
            }


        }

    }


    //function to print / draw the board in the Commandline
    public void drawBoard(){
        for(int i = 0; i < 9; i++){
            System.out.print(fields[i]);
            if(i == 2 | i == 5 | i == 8){
                System.out.println();
            }else {
                System.out.print("|");
            }

        }

        if (currentPlayer){
            System.out.println("O to make a move");
        } else {
            System.out.println("X to make a move");
        }

    }

    public void makeTurn(int field){
        if (currentPlayer){
            fields[field-1] = "X";
        } else {
            fields[field-1] = "O";
        }
        drawBoard();
    }


    //function to check if somebody won the Game
    public boolean checkWin(){
        if((fields[0].equals("X") & fields[1].equals("X") & fields[2].equals("X")) | (fields[0].equals("X") & fields[3].equals("X") & fields[6].equals("X")) | (fields[0].equals("X") & fields[4].equals("X") & fields[8].equals("X")) | (fields[1].equals("X") & fields[4].equals("X") & fields[7].equals("X")) | (fields[2].equals("X") & fields[5].equals("X") & fields[8].equals("X")) | (fields[3].equals("X") & fields[4].equals("X") & fields[5].equals("X")) | (fields[6].equals("X") & fields[7].equals("X") & fields[8].equals("X")) | (fields[2].equals("X") & fields[4].equals("X") & fields[6].equals("X"))){
            System.out.println("X hat gewonnen!!!");
            gameRunning = false;
            return true;
        }else if((fields[0].equals("O") & fields[1].equals("O") & fields[2].equals("O")) | (fields[0].equals("O") & fields[3].equals("O") & fields[6].equals("O")) | (fields[0].equals("O") & fields[4].equals("O") & fields[8].equals("O")) | (fields[1].equals("O") & fields[4].equals("O") & fields[7].equals("O")) | (fields[2].equals("O") & fields[5].equals("O") & fields[8].equals("O")) | (fields[3].equals("O") & fields[4].equals("O") & fields[5].equals("O")) | (fields[6].equals("O") & fields[7].equals("O") & fields[8].equals("O")) | (fields[2].equals("O") & fields[4].equals("O") & fields[6].equals("O"))){
            System.out.println("Y hat gewonnen!!!");
            gameRunning = true;
            return true;
        }else {
            return false;
        }
    }


}
