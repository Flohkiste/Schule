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

            System.out.print("\033[H\033[2J");
            System.out.flush();

            if (lastGame == 0){
                x++;
                System.out.println(game.coloredX() + " : " + game.coloredO());
                System.out.println(x + " : " + o);
            }else if (lastGame == 1){
                o++;
                System.out.println(game.coloredX() + " : " + game.coloredO());
                System.out.println(x + " : " + o);
            }

            if (x == gameRounds){
                gameRunning = false;
                System.out.println(game.coloredX() + " hat das Spiel gewonnen!");
            } else if (o == gameRounds) {
                gameRunning = false;
                System.out.println(game.coloredO() + " hat das Spiel gewonnen!");
            }


        }

    }

}
