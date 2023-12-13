package Klasse_12.Software.Arbeitsblatt_11;

public class Lehrer extends Person{
    private String aFach1;
    private String aFach2;

    public Lehrer() {
        super('L');
    }    

    public String getFach1() {
        return this.aFach1;
    }

    public void setFach1(String pFach1) {
        this.aFach1 = pFach1;
    }

    public String getFach2() {
        return this.aFach2;
    }

    public void setFach2(String pFach2) {
        this.aFach2 = pFach2;
    }

    public void info(){
        System.out.println("Ich bin ein Lehrer.\nMein Name ist " + this.aVorname + " " + this.aName + ".\nMeine Fächer sind  " + this.aFach1 + " und " + this.aFach2 + ".");
    }

}
