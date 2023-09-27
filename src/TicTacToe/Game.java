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
                System.out.println(coloredO() + " to make a move");
            } else {
                System.out.println(coloredX() + " to make a move");
            }
        }

    }

    private void makeTurn(int field){
        if (currentPlayer){
            fields[field-1] = coloredO();
        } else {
            fields[field-1] = coloredX();
        }

    }


    //function to check if somebody won the Game
    public boolean checkWin(){
        if((fields[0].equals(coloredX()) & fields[1].equals(coloredX()) & fields[2].equals(coloredX())) | (fields[0].equals(coloredX()) & fields[3].equals(coloredX()) & fields[6].equals(coloredX())) | (fields[0].equals(coloredX()) & fields[4].equals(coloredX()) & fields[8].equals(coloredX())) | (fields[1].equals(coloredX()) & fields[4].equals(coloredX()) & fields[7].equals(coloredX())) | (fields[2].equals(coloredX()) & fields[5].equals(coloredX()) & fields[8].equals(coloredX())) | (fields[3].equals(coloredX()) & fields[4].equals(coloredX()) & fields[5].equals(coloredX())) | (fields[6].equals(coloredX()) & fields[7].equals(coloredX()) & fields[8].equals(coloredX())) | (fields[2].equals(coloredX()) & fields[4].equals(coloredX()) & fields[6].equals(coloredX()))){
            System.out.println(coloredX() + " hat gewonnen!!!");
            result = 0;
            gameRunning = false;
            return true;
        } else if((fields[0].equals(coloredO()) & fields[1].equals(coloredO()) & fields[2].equals(coloredO())) | (fields[0].equals(coloredO()) & fields[3].equals(coloredO()) & fields[6].equals(coloredO())) | (fields[0].equals(coloredO()) & fields[4].equals(coloredO()) & fields[8].equals(coloredO())) | (fields[1].equals(coloredO()) & fields[4].equals(coloredO()) & fields[7].equals(coloredO())) | (fields[2].equals(coloredO()) & fields[5].equals(coloredO()) & fields[8].equals(coloredO())) | (fields[3].equals(coloredO()) & fields[4].equals(coloredO()) & fields[5].equals(coloredO())) | (fields[6].equals(coloredO()) & fields[7].equals(coloredO()) & fields[8].equals(coloredO())) | (fields[2].equals(coloredO()) & fields[4].equals(coloredO()) & fields[6].equals(coloredO()))){
            System.out.println(coloredO() + " hat gewonnen!!!");
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

    public String coloredX(){
        String x = "\u001B[31mX\u001B[0m";
        return x;
    }

    public String coloredO(){
        String o = "\u001B[34mO\u001B[0m";
        return o;
    }


}
