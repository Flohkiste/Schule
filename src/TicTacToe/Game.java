package TicTacToe;

import java.util.Scanner;

public class Game {

    boolean currentPlayer = false;
    int turns = 0;
    int result;
    boolean gameRunning = true;
    int playerMove;
    Scanner scanner = new Scanner(System.in);

    String[] fields = { "1", "2", "3",
                        "4", "5", "6",
                        "7", "8", "9" };

    private void playerInput(){
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

    private void checkField(){
        if(fields[playerMove-1].equals("X") | fields[playerMove-1].equals("O")){
            System.out.println("Feld schon belegt bitte wähl ein freies!");
            playerInput();
        }
    }

    private void reset(){
        currentPlayer = false;
        turns = 0;
        gameRunning = true;
        for (int x = 0; x < 9; x++){
            fields[x] = String.valueOf(x+1);
        }
    }


    public int gameLoop(){
        reset();
        drawBoard();

        while (gameRunning){
            playerInput();
            makeTurn(playerMove);
            if (currentPlayer){
                currentPlayer = false;
            } else {
                currentPlayer = true;
            }

            System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
            drawBoard();
            turns ++;

        }
        return result;

    }


    //function to print / draw the board in the Commandline
    private void drawBoard(){
        for(int i = 0; i < 9; i++){
            System.out.print(fields[i]);
            if(i == 2 | i == 5 | i == 8){
                System.out.println();
            }else {
                System.out.print("|");
            }


        }
        if (checkWin() == false){
            if (currentPlayer){
                System.out.println("O to make a move");
            } else {
                System.out.println("X to make a move");
            }
        }

    }

    private void makeTurn(int field){
        if (currentPlayer){
            fields[field-1] = "O";
        } else {
            fields[field-1] = "X";
        }

    }


    //function to check if somebody won the Game
    public boolean checkWin(){
        if((fields[0].equals("X") & fields[1].equals("X") & fields[2].equals("X")) | (fields[0].equals("X") & fields[3].equals("X") & fields[6].equals("X")) | (fields[0].equals("X") & fields[4].equals("X") & fields[8].equals("X")) | (fields[1].equals("X") & fields[4].equals("X") & fields[7].equals("X")) | (fields[2].equals("X") & fields[5].equals("X") & fields[8].equals("X")) | (fields[3].equals("X") & fields[4].equals("X") & fields[5].equals("X")) | (fields[6].equals("X") & fields[7].equals("X") & fields[8].equals("X")) | (fields[2].equals("X") & fields[4].equals("X") & fields[6].equals("X"))){
            System.out.println("X hat gewonnen!!!");
            result = 0;
            gameRunning = false;
            return true;
        }else if((fields[0].equals("O") & fields[1].equals("O") & fields[2].equals("O")) | (fields[0].equals("O") & fields[3].equals("O") & fields[6].equals("O")) | (fields[0].equals("O") & fields[4].equals("O") & fields[8].equals("O")) | (fields[1].equals("O") & fields[4].equals("O") & fields[7].equals("O")) | (fields[2].equals("O") & fields[5].equals("O") & fields[8].equals("O")) | (fields[3].equals("O") & fields[4].equals("O") & fields[5].equals("O")) | (fields[6].equals("O") & fields[7].equals("O") & fields[8].equals("O")) | (fields[2].equals("O") & fields[4].equals("O") & fields[6].equals("O"))){
            System.out.println("O hat gewonnen!!!");
            gameRunning = false;
            result = 1;
            return true;
        }else if (turns >= 8){
            System.out.println("Unentschieden!!!");
            gameRunning = false;
            result = 2;
            return true;
        }else {
            return false;
        }
    }


}
