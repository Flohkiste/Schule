package Arbeitsblatt_4;

public class Aufgabe_1 {
    public static void main(String[] args) {
        double kraftstoff = 52.5;
        int strecke = 500;
        double ergebnis;
        System.out.println("Berechnung des Durchschnittsverbrauchs");
        System.out.println("verbrauchter Kraftstoff in l: " + kraftstoff);
        System.out.println("gefahrene Strecke in km: " + strecke);
        ergebnis = (kraftstoff * 100) / strecke;
        System.out.println("Der Durchschnittsverbrauch ist " + ergebnis + " l/100km");
        System.out.println("Programmende Benzin");
    }
}
