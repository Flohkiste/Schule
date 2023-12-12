package Klasse_12.Software.Arbeitsblatt_4_CT;

public class Kontakt {
    private String vorname;
    private String nachname;
    private String strasse;
    private String hausnummer;
    private String wohnort;
    private String plz;
    private String email;
    private String kommentar;

    public Kontakt(){

    }

    public Kontakt(String vorname,String nachname, String strasse, String hausnummer, String wohnort, String plz, String email) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.wohnort = wohnort;
        this.plz = plz;
        this.email = email;
    }

    public void ausgabe() {
        System.out.println("Vorname: " + vorname);
        System.out.println("Nachname: " + nachname);
        System.out.println("Adresse: " + strasse + " " + hausnummer);
        System.out.println("Wohnort: " + wohnort);
        System.out.println("PLZ: " + plz);
        System.out.println("Email: " + email);
        System.out.println("Kommentar: " + kommentar);
    }

    public String getVorname() {
        return this.vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname(){
        return this.nachname;
    }

    public void setNachname(String nachname){
        this.nachname = nachname;
    }

    public String getStrasse(){
        return this.strasse;
    }

    public void setStrasse(String straße) {
        this.strasse = straße;
    }

    public String getHausnummer() {
        return this.hausnummer;
    }

    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }

    public String getWohnort() {
        return this.wohnort;
    }

    public void setWohnort(String wohnort) {
        this.wohnort = wohnort;
    }

    public String getPlz() {
        return this.plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKommentar(){
        return kommentar;
    }

    public void setKommentar(String kommentar){
        this.kommentar = kommentar;
    }

}
