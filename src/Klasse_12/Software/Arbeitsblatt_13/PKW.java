public class PKW extends Fahrzeug {
    private int aAnzTueren;
    private String aArt;
    private String aTyp;

    public PKW(int pMaxGesch, int pAnzRaeder) {
        super(pMaxGesch, pAnzRaeder);
    }

    public void beschleunigen(int pZ) {
        do{
            aAktGesch*=1.13;
        }while(aAktGesch<pZ);
    }

    public int getAnzTueren() {
        return aAnzTueren;
    }

    public void setAnzTueren(int anzTueren) {
        aAnzTueren = anzTueren;
    }

    public String getArt() {
        return aArt;
    }

    public void setArt(String art) {
        aArt = art;
    }

    public String getTyp() {
        return aTyp;
    }

    public void setTyp(String typ) {
        aTyp = typ;
    }
    
}