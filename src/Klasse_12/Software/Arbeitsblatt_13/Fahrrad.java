public class Fahrrad extends Fahrzeug {
    private int aRahmen;
    private int aAnzGaenge;

    public Fahrrad(int pMaxGesch, int pAnzRaeder) {
        super(pMaxGesch, pAnzRaeder);
    }

    @Override
    public void beschleunigen(int pZ) {
        do {
            aAktGesch *= 1.01;
        } while (aAktGesch < pZ);
    }

    public int getARahmen() {
        return aRahmen;
    }

    public void setARahmen(int aRahmen) {
        this.aRahmen = aRahmen;
    }

    public int getAAnzGaenge() {
        return aAnzGaenge;
    }

    public void setAAnzGaenge(int aAnzGaenge) {
        this.aAnzGaenge = aAnzGaenge;
    }
}