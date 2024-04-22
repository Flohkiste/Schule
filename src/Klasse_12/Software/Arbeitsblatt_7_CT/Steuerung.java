package hotelkette;

public class Steuerung {
    private static int aAnzahlHotels = 0;
    private GUI dieGUI;
    private Hotel dasHotel[];
    private int aktHotel = 0;
    
    public Steuerung(GUI pGUI) {
    	dieGUI = pGUI;
    }
	
	public double berechneSteuer(Hotel betrag[]) {
		double vermoegen = berechneVermoegen(betrag);
		return vermoegen * 0.08;
	}
	
	public double berechneVermoegen(Hotel betrag[]) {
        double vermoegen = 0;
		for(Hotel x:betrag) {
            if (x != null){
                vermoegen += x.dollarBetrag();
            }
        }
        return vermoegen;
	}
	
	public void setDaten(int anzHotel, double kursEuro, double kursYen) {
		aAnzahlHotels = anzHotel;
		Japan.setKurs(kursYen);
		Europa.setKurs(kursEuro);
		dasHotel = new Hotel[aAnzahlHotels];
	}
	
	public Hotel[] getHotels() {
		return dasHotel;
	}
	
	public void hotelErzeugen(Hotel hotel) {
		dasHotel[aktHotel] = hotel;
		aktHotel++;
	}

}
