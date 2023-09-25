package Arbeitsblatt_4;

public class Aufgabe_2 {
    public static void main(String[] args) {
        double dividend = 23;
        double divisor = 4;
        int ergebnis;
        int rest;
        System.out.println("Ganzzahlige Division mit Rest");
        System.out.println("Dividend: " + dividend);
        System.out.println("Divisor: " + divisor);
        ergebnis = (int) (dividend / divisor);
        rest = (int) (dividend % divisor);
        System.out.println("Das Ergebnis der Division " + dividend + " / " + divisor + " ist " + ergebnis + " der Rest ist " + rest);
        System.out.println("Programmende Ganzteil.");

    }
}
