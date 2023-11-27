package Klasse_12.Software.Arbeitsblatt_7;
public class Steuerung {
    public static void main(String[] args){
        Blume[] blumen = {new Blume("Rose", "Rot"), new Blume("Tulpe", "Lila")};
        Tier[] tiere = {new Tier("Zebra", 380, 65.0), new Tier("Jaguar", 60, 80.0)};
        Musikinstrument[] musikeinstrumente = {new Musikinstrument("Gitarre"), new Musikinstrument("Klavier")};

        blumen[0].info();
        tiere[0].info();
        tiere[0].rennen();
        System.out.println(musikeinstrumente[0].erzeugeTonfolge() + "\n" + musikeinstrumente[0].erzeugeTonfolge());
        tiere[1].info();
        tiere[1].rennen();
        blumen[1].info();
    }
}
