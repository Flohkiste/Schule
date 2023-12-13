package Klasse_12.Software.Arbeitsblatt_11;

public class Steuerung {
    public static void main(String[] args) {
        Schueler schueler = new Schueler();
        Lehrer lehrer = new Lehrer();

        schueler.setVorname("Lara");
        schueler.setName("Wagner");
        schueler.setKlasse("12a");

        lehrer.setName("Beck");
        lehrer.setVorname("Franz");
        lehrer.setFach1("Deutsch");
        lehrer.setFach2("Sport");

        schueler.info();
        System.out.println();
        lehrer.info();

    }
}
