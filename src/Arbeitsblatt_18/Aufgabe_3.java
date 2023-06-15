package Arbeitsblatt_18;
import java.util.Scanner;
public class Aufgabe_3 {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String name = hallo();
		summe();
		cube();
		System.out.println("Tschüss " + name);
	}
	
	private static void summe() {
		System.out.println("Gib zwei Zahlen a und b ein:");
		int zahlA = scanner.nextInt();
		int zahlB = scanner.nextInt();
		System.out.println("Die Summe der Zahlen lauten: " + (zahlA + zahlB));
	}
	
	private static void cube() {
		System.out.println("Gib eine Zahl ein: ");
		int zahl = scanner.nextInt();
		System.out.println("Das Kubik der Zahl lautet: " + zahl * zahl * zahl);
	}
	
	private static String hallo() {
		System.out.print("Bitte geben Sie ihren Namen ein: ");
		String name = scanner.next();
		System.out.println("Hallo " + name + ".");
		return name;
	}

}
