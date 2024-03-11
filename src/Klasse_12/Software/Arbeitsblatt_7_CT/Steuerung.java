import java.util.Scanner;

public class Steuerung {
    private static int aAnzahlHotels = 0;
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Hotel dasHotel[] = new Hotel[10];

        

        dasHotel[0] = new Europa(300000);
        dasHotel[1] = new Japan(27000000);
        dasHotel[3] = new USA(270000);
        dasHotel[2] = new Europa(330000);
        dasHotel[4] = new Japan(3000000);

        System.out.print("Gib den aktuellen Eurokurs ein: ");
        Europa.setKurs(sc.nextDouble());
        System.out.print("Gib den aktuellen Yenkurs ein: ");
        Japan.setKurs(sc.nextDouble());
        for (Hotel x : dasHotel) {
            if (x != null) {
                System.out.println(x.dollarBetrag());
            }
        }

        System.out.println("\nDie zu zahlende Steuer: " + berechneSteuer(dasHotel));
        System.out.println("\nDas Vermoegen vor der Aenderung: " + berechneVermoegen(dasHotel));
        dasHotel[3].aWert -= berechneSteuer(dasHotel);
        System.out.println("Das Vermoegen nach der Aenderung: " + berechneVermoegen(dasHotel));

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

}
