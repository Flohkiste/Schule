package Klasse_12.Software.Arbeitsblatt_2_2;

public class Aufgabe_2 {
    public static void main(String[] args) {
        System.out.println(getBetrag(-10));
        System.out.println(getAnzahlZiffern(1241234));
        System.out.println(getZiffernWert(1234, 2));
        System.out.println(ersetzeZiffer(1234, 2, 5));
        System.out.println(ersetzeZiffer1(1234, 2, 5));
    }

    public static int getBetrag(int pZahl) {
        if (pZahl < 0) {
            pZahl = pZahl * -1;
        }

        return pZahl;
    }

    public static int getAnzahlZiffern(int pZahl) {
        int x = 1;

        while (true) {
            if ((pZahl > (Math.pow(10, x)))) {
                x++;
            } else {
                return x;
            }
        }
    }

    public static int getZiffernWert(int pZahl, int pStelle) {
        String pZahlString = String.valueOf(pZahl);
        pZahl = Character.getNumericValue(pZahlString.charAt(pZahlString.length() - pStelle - 1));
        return pZahl;
    }

    public static int ersetzeZiffer(int pZahl, int pStelle, int pWert) {
        StringBuilder pZahlString = new StringBuilder(String.valueOf(pZahl));
        pStelle = pZahlString.length() - pStelle - 1;
        pZahlString.setCharAt(pStelle, Character.forDigit(pWert, 10));
        return Integer.parseInt(pZahlString.toString());
    }

    // Ab hier nicht fertig

    public static int[] intToArray(int number) {
        String numberString = String.valueOf(number);
        int numberLenght = numberString.length();
        int[] numberArray = new int[numberLenght];

        for (int x = 0; x < numberLenght; x++) {
            numberArray[x] = numberString.charAt(x);
        }

        return numberArray;
    }

    public static int ersetzeZiffer1(int pZahl, int pStelle, int pWert) {
        String pZahlString;
        int[] pZahlArray = intToArray(pZahl);

        for (int i = 0; i < pZahlArray.length; i++) {
            System.out.print(pZahlArray[i] + " ");
        }

        pZahlArray[pZahlArray.length - pStelle - 1] = pWert;

        pZahlString = String.valueOf(pZahlArray[0]);
        for (int x = 1; x < pZahlArray.length; x++) {
            pZahlString = pZahlString + pZahlArray[x];
        }
        pZahl = Integer.valueOf(pZahlString);

        return pZahl;
    }

}
