package Klasse_12.Software.Arbeitsblatt_7;
import java.util.Random;

public class Blume{
    Random random = new Random();
    private String aBezeichnung;
    private String aFarbe;

    public Blume(String bezeichnung, String farbe){
        this.aBezeichnung = bezeichnung;
        this.aFarbe = farbe;
    }

    private boolean duftet(){
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

    public void setBezeichnung(String bezeichnung){
        aBezeichnung = bezeichnung;
    }

    public String getBezeichnung(){
        return aBezeichnung;
    }

    public void setFarbe(String farbe){
        aFarbe = farbe;
    }

    public String getFarbe(){
        return aFarbe;
    }
}