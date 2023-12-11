
public class Aufgabe_3{
    public static void main(String[] args){
        Figur[] figuren = new Figur[10];
        for(int i = 0; i < figuren.length; i++){
            figuren[i] = new Figur();
            figuren[i].setBezeichnung("Figur " + i);
            figuren[i].setXPos((int)(Math.random() * 100));
            figuren[i].setYPos((int)(Math.random() * 100));
        }
    }
    
}