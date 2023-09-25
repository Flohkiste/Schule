package Arbeitsblatt_17;

public class Aufgabe_2 {
    public static void main(String[] args){
        String[][] personen = new String[][]{{"Gerda", "Schmitt"}, {"Hanna", "Müller"}, {"Martha", "Metz"}};

        for(int x = 0; x < 3; x++){
            for(int y = 0; y < 2; y++){
                System.out.print(personen[x][y] + " ");
            }

            System.out.println();

        }

    }
}
