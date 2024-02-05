public class LKW extends Fahrzeug{
    private int aMaxTransGew;

    public LKW(int pMaxGesch, int pAnzRaeder) {
        super(pMaxGesch, pAnzRaeder);
    }

    public void beschleunigen(int pZ) {
        do{
            aAktGesch*=1.09;
        }while(aAktGesch<pZ);
    }

    public int getAMaxTransGew() {
        return aMaxTransGew;
    }

    public void setAMaxTransGew(int aMaxTransGew) {
        this.aMaxTransGew = aMaxTransGew;
    }
    
}