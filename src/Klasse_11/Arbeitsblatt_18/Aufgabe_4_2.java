import java.util.Random;

public class Aufgabe_4_2 {

	public static Random rand = new Random();
	
	public static void main(String[] args) {
		
		vorhersage();
	}
	
	private static void vorhersage() {
		int number = rand.nextInt(2);
		
		if(number == 0) {
			System.out.println("Es ist wahr!");
		}else {
			System.out.println("Es ist falsch!");
		}
	}

}
