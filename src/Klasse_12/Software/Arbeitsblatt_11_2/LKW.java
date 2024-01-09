public class LKW extends Fahrzeug{
    private double aMaxTransportGewicht;
    
    public LKW(int pMaxGesch, int pAnzRaeder) {
        super(pMaxGesch, pAnzRaeder);
        //TODO Auto-generated constructor stub
    }

    public double getAMaxTransportGewicht() {
        return aMaxTransportGewicht;
    }

    public void setAMaxTransportGewicht(double pMaxTransportGewicht) {
        this.aMaxTransportGewicht = pMaxTransportGewicht;
    }
}
