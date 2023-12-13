package Klasse_12.Software.Arbeitsblatt_11;

public class Schueler extends Person{
    public Schueler() {
        super('S');
    }

    private String aKlasse;

    public String getKlasse() {
        return this.aKlasse;
    }

    public void setKlasse(String pKlasse) {
        this.aKlasse = pKlasse;
    }

    public void info(){
        System.out.println("Ich bin ein Schüler.\nMein Name ist " + this.aVorname + " " + this.aName + ".\nIch gehe in die Klasse " + this.aKlasse + ".");
    }

}
