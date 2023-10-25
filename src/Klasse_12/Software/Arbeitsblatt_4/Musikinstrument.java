package Klasse_12.Software.Arbeitsblatt_4;
import java.util.Random;

public class Musikinstrument {
    Random random = new Random();
    String aBezeichnung;
    char aNote;

    public Musikinstrument(String bezeichnung){
        aBezeichnung = bezeichnung;
    }

    public char gibTon(){
        int randomnumber = random.nextInt(7);
        char[] noten = {'C', 'D', 'E', 'F', 'G', 'A', 'H'};
        return noten[randomnumber];
    }
    public String erzeugeTonfolge(){
        String tonfolge = "";
        int länge = random.nextInt(50);
        for(int x = 0; x < länge; x++){
            tonfolge += gibTon();
        }
        return tonfolge;
    }
}
