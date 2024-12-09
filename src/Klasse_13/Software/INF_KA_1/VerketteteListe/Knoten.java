package Klasse_13.Software.INF_KA_1.VerketteteListe;

public class Knoten {
    private double value;
    private Knoten next;

    public Knoten(double wert, Knoten neu) {
        this.value = wert;
        this.next = neu;
    }

    public void setValue(double wert) {
        this.value = wert;
    }

    public void setNext(Knoten element) {
        this.next = element;
    }

    public double getValue() {
        return this.value;
    }

    public Knoten getNext() {
        return this.next;
    }
}
