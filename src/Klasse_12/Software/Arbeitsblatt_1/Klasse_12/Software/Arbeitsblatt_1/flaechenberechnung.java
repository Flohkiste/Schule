package Klasse_12.Software.Arbeitsblatt_1;
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

	public static void flaeche_kreis() {
		System.out.println("Fläche des Kreises: ");
		System.out.print("Bitte länge des Radius r eingeben: ");
		int r = sc.nextInt();
		System.out.println("Fläche Kreis: " + Math.PI * r * r);
	}

	public static void flaeche_quadrat() {
		System.out.println("Fläche des Quadrats: ");
		System.out.print("Bitte länge der Seite a eingeben: ");
		int a = sc.nextInt();
		System.out.println("Fläche Quadrat: " + a * a);
	}

	//volumen einer pyramide
	public static void volumen_pyramide() {
		System.out.println("Volumen der Pyramide: ");
		System.out.print("Bitte länge der Grundseite g eingeben: ");
		int g = sc.nextInt();
		System.out.print("Bitte länge der Höhe h eingeben: ");
		int h = sc.nextInt();
		System.out.println("Volumen Pyramide: " + (g * h) / 3);
	}
	

}
