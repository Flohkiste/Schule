package Klasse_12.Software.Arbeitsblatt_2_2;

public class Aufgabe_2 {
    public static void main(String[] args){
        System.out.println(getBetrag(-10));
        System.out.println(getAnzahlZiffern(1241234));
        System.out.println(getZiffernWert(1234, 2));
        System.out.println(ersetzeZiffer(1234, 2, 5));
    }

    public static int getBetrag(int pZahl){
        if(pZahl < 0){
            pZahl = pZahl * -1;
        } 

        return pZahl;
    }

    public static int getAnzahlZiffern(int pZahl){
        int x = 1;

        while(true){
            if((pZahl > (Math.pow(10, x)))){
                x++;
            }else{
                return x;
            }
        }
    }

    public static int getZiffernWert(int pZahl, int pStelle){
        String pZahlString = String.valueOf(pZahl);
        pZahl = Character.getNumericValue(pZahlString.charAt(pZahlString.length() - pStelle - 1));
        return pZahl;
    }

    public static int ersetzeZiffer(int pZahl, int pStelle, int pWert){
        StringBuilder pZahlString = new StringBuilder(String.valueOf(pZahl));
        pStelle = pZahlString.length() - pStelle - 1;
        pZahlString.setCharAt(pStelle, Character.forDigit(pWert, 10));
        return Integer.parseInt(pZahlString.toString());
    }
}
