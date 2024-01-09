public class Fahrrad extends Fahrzeug{
    private double aRahmenGr;
    private int aAnzGaenge;

    public Fahrrad(int pMaxGesch, int pAnzRaeder) {
        super(pMaxGesch, pAnzRaeder);
        //TODO Auto-generated constructor stub
    }

    public double getRahmenGr() {
        return aRahmenGr;
    }

    public void setRahmenGr(double pRahmenGr) {
        aRahmenGr = pRahmenGr;
    }

    public int getAnzGaenge() {
        return aAnzGaenge;
    }

    public void setAnzGaenge(int pAnzGaenge) {
        aAnzGaenge = pAnzGaenge;
    }

}
