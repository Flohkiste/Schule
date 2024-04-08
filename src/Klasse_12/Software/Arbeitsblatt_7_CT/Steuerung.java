package hotelkette;

public class Steuerung {
    private static int aAnzahlHotels = 0;
    private GUI dieGUI;
    private Hotel dasHotel[];
    
    public Steuerung(GUI pGUI) {
    	dieGUI = pGUI;
    }
	
	private static double berechneSteuer(Hotel betrag[]) {
		double vermoegen = berechneVermoegen(betrag);
		return vermoegen * 0.08;
	}
	
	private static double berechneVermoegen(Hotel betrag[]) {
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
	}

}
