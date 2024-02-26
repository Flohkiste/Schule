public abstract class Hotel {
	protected double aWert;
	
	abstract public double dollarBetrag();
	
	public void vermoegenAendern(double pWert) {
		aWert += pWert;
	}
	
}
