import java.util.Scanner;

public class Aufgabe_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(potenz(scanner.nextDouble(), scanner.nextDouble()));
		scanner.close();
	}
	
	public static double potenz(double basis, double exponent) {
		double ergebnis = 0;
		for(int x=1; x < exponent; x++) {
			ergebnis = basis * basis;
		}
		if(exponent == 0) {
			ergebnis = 1;
		}
		
		return ergebnis;
	}
}
