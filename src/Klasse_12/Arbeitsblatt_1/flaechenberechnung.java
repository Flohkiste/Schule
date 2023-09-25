
import java.util.Scanner;

public class flaechenberechnung {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		flaeche_rechteck();
		flaeche_dreieck();
		flaeche_rechteck();
		flaeche_rechteck();
		flaeche_dreieck();
		
	}
	
	public static void flaeche_rechteck() {
		System.out.println("Fläche des Rechteckks: ");
		System.out.print("Bitte länge der Seite a eingeben: ");
		int a = sc.nextInt();
		System.out.print("Bitte länge der Seite b eingeben: ");
		int b = sc.nextInt();
		System.out.println("Fläche Rechteck: " + a * b);
	}
	
	public static void flaeche_dreieck() {
		System.out.println("Fläche des Dreiecks: ");
		System.out.print("Bitte länge der Grundseite g eingeben: ");
		int g = sc.nextInt();
		System.out.print("Bitte länge der Höhe h eingeben: ");
		int h = sc.nextInt();
		System.out.println("Fläche Dreieck: " + (g * h) / 2);
	}
	

}
