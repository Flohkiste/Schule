package TicTacToe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        int gameRounds = 0;
        int x = 0;
        int o = 0;
        boolean gameRunning = true;
        int lastGame;

        System.out.print("Bis wie viel wollen sie Spielen? ");
        gameRounds = scanner.nextInt();

        while (gameRunning){
            lastGame = game.gameLoop();

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");

            if (lastGame == 0){
                x++;
                System.out.println("X : O");
                System.out.println(x + " : " + o);
            }else if (lastGame == 1){
                o++;
                System.out.println("X : O");
                System.out.println(x + " : " + o);
            }

            if (x == gameRounds){
                gameRunning = false;
                System.out.println("X hat das Spiel gewonnen!");
            } else if (o == gameRounds) {
                gameRunning = false;
                System.out.println("O hat das Spiel gewonnen!");
            }


        }

    }

}
