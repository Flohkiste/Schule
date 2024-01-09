public class Fahrzeug {
    protected int aMaxGesch;
    protected int aAnzRaeder;
    protected int aAktGesch;

    public Fahrzeug(int pMaxGesch, int pAnzRaeder) {
        aMaxGesch = pMaxGesch;
        aAnzRaeder = pAnzRaeder;
        aAktGesch = 0;
    }

    public int getMaxGesch() {
        return aMaxGesch;
    }

    public int getAnzRaeder() {
        return aAnzRaeder;
    }

    public int getAktGesch() {
        return aAktGesch;
    }

    public void setAktGesch(int aktGesch) {
        aAktGesch = aktGesch;
    }

    public void beschleunigen(int pGesch){

    }

    public void anhalten(){

    }
    
}