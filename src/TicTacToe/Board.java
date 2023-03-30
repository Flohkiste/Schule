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
}
