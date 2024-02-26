public class Japan extends Hotel {
	
	private static double aKurs;

	public Japan(double pWert) {
		super.aWert = pWert;
	}

	@Override
	public double dollarBetrag() {
		return aWert * aKurs;
	}
	
	public static void setKurs(double pKurs) {
		aKurs = pKurs;
	}

}
