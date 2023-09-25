import java.util.Scanner;

public class Aufgabe_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(potenz(scanner.nextDouble(), scanner.nextDouble()));
		scanner.close();
	}
	
	public static double potenz(double basis, double exponent) {
		double ergebnis = Math.pow(basis,exponent);
		
		return ergebnis;
	}
}
