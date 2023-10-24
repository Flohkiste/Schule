import java.util.Random;

public class Blume{
    Random random = new Random();
    String aBezeichnung;
    String aFarbe;

    public Blume(String bezeichnung, String farbe){
        this.aBezeichnung = bezeichnung;
        this.aFarbe = farbe;
    }

    public boolean duftet(){
        boolean ergebnis = random.nextBoolean();
        return ergebnis;
    }

    public void info(){
        if(duftet()){
            System.out.println("Ich bin eine " + aBezeichnung + " mit Duft in der Farbe " + aFarbe);
        }else{
            System.out.println("Ich bin eine " + aBezeichnung + " ohne Duft in der Farbe " + aFarbe);
        }
    }
}