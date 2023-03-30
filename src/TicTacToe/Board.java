package TicTacToe;

public class Board {
    String[] fields = { "1", "2", "3",
                        "4", "5", "6",
                        "7", "8", "9" };

    public void draw(){
        for(int i = 0; i < 9; i++){
            System.out.print(fields[i]);
            if(i == 2 | i == 5 | i == 8){
                System.out.println();
            }else {
                System.out.print("|");
            }

        }
    }

    //function to check if somebody won the Game
    public boolean checkWin(){
        if((fields[0].equals("X") & fields[1].equals("X") & fields[2].equals("X")) | (fields[0].equals("X") & fields[3].equals("X") & fields[6].equals("X")) | (fields[0].equals("X") & fields[4].equals("X") & fields[8].equals("X")) | (fields[1].equals("X") & fields[4].equals("X") & fields[7].equals("X")) | (fields[2].equals("X") & fields[5].equals("X") & fields[8].equals("X")) | (fields[3].equals("X") & fields[4].equals("X") & fields[5].equals("X")) | (fields[6].equals("X") & fields[7].equals("X") & fields[8].equals("X")) | (fields[2].equals("X") & fields[4].equals("X") & fields[6].equals("X"))){
            System.out.println("X hat gewonnen!!!");
            return true;
        }else if((fields[0].equals("O") & fields[1].equals("O") & fields[2].equals("O")) | (fields[0].equals("O") & fields[3].equals("O") & fields[6].equals("O")) | (fields[0].equals("O") & fields[4].equals("O") & fields[8].equals("O")) | (fields[1].equals("O") & fields[4].equals("O") & fields[7].equals("O")) | (fields[2].equals("O") & fields[5].equals("O") & fields[8].equals("O")) | (fields[3].equals("O") & fields[4].equals("O") & fields[5].equals("O")) | (fields[6].equals("O") & fields[7].equals("O") & fields[8].equals("O")) | (fields[2].equals("O") & fields[4].equals("O") & fields[6].equals("O"))){
            System.out.println("Y hat gewonnen!!!");
            return true;
        }else {
            return false;
        }
    }


}
