public class Steuerung {
    public static void main(String[] args) {
        Fahrzeug dasFahrzeug[] = new Fahrzeug[10];
        dasFahrzeug[0]=new Fahrrad(40, 2);
        dasFahrzeug[1]=new PKW(220, 4);
        dasFahrzeug[2]=new Fahrrad(30, 3);
        dasFahrzeug[0]=new LKW(130, 8);
        System.out.println(Fahrzeug.getAnzFahrzeuge());
    }
}
