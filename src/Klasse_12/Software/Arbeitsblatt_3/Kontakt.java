package Klasse_12.Software.Arbeitsblatt_3;

public class Kontakt {
    private String name;
    private String straße;
    private String hausnummer;
    private String wohnort;
    private String plz;
    private String email;

    public Kontakt(String name, String straße, String hausnummer, String wohnort, String plz, String email) {
        this.name = name;
        this.straße = straße;
        this.hausnummer = hausnummer;
        this.wohnort = wohnort;
        this.plz = plz;
        this.email = email;
    }

    public void ausgabe() {
        System.out.println("Name: " + name);
        System.out.println("Adresse: " + straße + " " + hausnummer);
        System.out.println("Wohnort: " + wohnort);
        System.out.println("PLZ: " + plz);
        System.out.println("Email: " + email);
    }
}
