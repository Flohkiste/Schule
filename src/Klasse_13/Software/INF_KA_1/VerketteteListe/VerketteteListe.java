package Klasse_13.Software.INF_KA_1.VerketteteListe;

public class VerketteteListe {

    private Knoten first;

    public VerketteteListe() {
        first = null;
    }

    public void addFirst(double zahl) {
        if (first == null) {
            first = new Knoten(zahl, null);
            return;
        }
        
        Knoten newKnoten = new Knoten(zahl, first);
        first = newKnoten;
    }

    public double getFirst() {
        return first.getValue();
    }

    public void removeFirst() {
        first = first.getNext();
    }

    public boolean isEmpty() {
        if (first == null) {
            return true;
        }
        return false;
    }

    public int getSize() {
        int x = 0;
        Knoten curKnoten = first;

        while (curKnoten != null) {
            x ++;
            curKnoten = curKnoten.getNext();
        }

        return x;
    }

    public double getElement(int index) {
        Knoten curKnoten = first;

        for (int x = 0; x < index; x++) {
            curKnoten = curKnoten.getNext();
        }

        return curKnoten.getValue();
    }

    public void insertElement(int index, double wert) {
        Knoten curKnoten = first;

        for (int x = 0; x < index - 1; x++) {
            curKnoten = curKnoten.getNext();
        }

        curKnoten.setNext(new Knoten(wert, curKnoten.getNext()));
    }

    public void replaceElement(int index, double wert) {
        Knoten curKnoten = first;

        for (int x = 0; x < index; x++) {
            curKnoten = curKnoten.getNext();
        }

        curKnoten.setValue(wert);
    }

    public void addLast(double wert) {
        if(first == null) {
            first = new Knoten(wert, null);
            return;
        }

        Knoten curKnoten = first;

        while (curKnoten.getNext() != null) {
            curKnoten = curKnoten.getNext();
        }

        curKnoten.setNext(new Knoten(wert, null));
    }
}
