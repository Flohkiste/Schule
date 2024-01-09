public class Auto extends Fahrzeug{
    private int aAnzTueren;
    private int aArt;
    private int aTyp;

    public Auto(int pMaxGesch, int pAnzRaeder) {
        super(pMaxGesch, pAnzRaeder);
        //TODO Auto-generated constructor stub
    }    

    public int getAnzTueren() {
        return aAnzTueren;
    }

    public void setAnzTueren(int anzTueren) {
        this.aAnzTueren = anzTueren;
    }

    public int getArt() {
        return aArt;
    }

    public void setArt(int art) {
        this.aArt = art;
    }

    public int getTyp() {
        return aTyp;
    }

    public void setTyp(int typ) {
        this.aTyp = typ;
    }

}
