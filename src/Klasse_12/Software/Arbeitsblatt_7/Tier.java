package Klasse_12.Software.Arbeitsblatt_7;

public class Tier {
    String aArt;
    int aGewicht;
    double aMaxGeschwindigkeit;
    public Tier(String art, int gewicht, double maxGeschwindigkeit){
        this.aArt = art;
        this.aGewicht = gewicht;
        this.aMaxGeschwindigkeit = maxGeschwindigkeit;
    }
    
    public void info(){
        System.out.println("Ich bin ein " + aArt + " und wiege " + aGewicht + "kg");
    }

    public void rennen(){
        int geschwindigkeit = 0 + (int)(Math.random() * (this.aMaxGeschwindigkeit + 1));

        if(geschwindigkeit == 0){
            System.out.println("Ich stehe...");
        }else if(geschwindigkeit < 20){
            System.out.println("Ich spaziere...");
        }else if(geschwindigkeit < this.aMaxGeschwindigkeit){
            System.out.println("Ich renne...");
        }else{
            System.out.println("Ich sprinte...");
        }
    }
}
