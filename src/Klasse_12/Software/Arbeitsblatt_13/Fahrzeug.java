public abstract class Fahrzeug {
    protected int aAktGesch;
    protected int aMaxGesch;
    protected int aAnzRaeder;
    private static int aAnzFahrzeuge = 0;

    public Fahrzeug(int pMaxGesch, int pAnzRaeder){
        aMaxGesch=pMaxGesch;
        aAnzRaeder=pAnzRaeder;
        aAnzFahrzeuge++;
    }

    public int getAktGesch() {
        return aAktGesch;
    }

    public int getMaxGesch() {
        return aMaxGesch;
    }

    public int getAnzRaeder() {
        return aAnzRaeder;
    }

    public abstract void beschleunigen(int pZ);

    public void bremsen() { }

    public static int getAnzFahrzeuge() {
        return aAnzFahrzeuge;
    }

}