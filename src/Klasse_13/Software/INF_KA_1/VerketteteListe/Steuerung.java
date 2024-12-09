package Klasse_13.Software.INF_KA_1.VerketteteListe;

public class Steuerung {
    public static VerketteteListe liste = new VerketteteListe();

    public static void main(String[] args) {


        System.out.println("Wurde eine Leere Liste erstellt?");
        isEmpty();

        System.out.println("Füge die Zahl 8 in die Liste ein.");
        liste.addLast(8);

        System.out.println("Prüfung ob die Liste immer noch leer ist.");
        isEmpty();

        System.out.println("Gib das erstes Element der Liste:" + liste.getFirst());

        System.out.println("Füge die 7 am Anfang der Liste ein");
        liste.addFirst(7);

        System.out.println("Gib das erstes Element der Liste:" + liste.getFirst());

        System.out.println("Füge nun jeweils die Zahlen 6 bis 1 am Anfang der Liste ein");
        for (int x = 6; x > 0; x--) {
            liste.addFirst((double) x);
        }

        System.out.println("Gib die Anzahl der Elemente aus: " + liste.getSize());

        System.out.println("Gib die 5. Zahl aus: " + liste.getElement(4));

        System.out.println("Füge die Zahl 12 an der Stelle 2 ein.");
        liste.insertElement(2, 12);

        for (int x = 0; x < liste.getSize(); x++) {
            System.out.print(liste.getElement(x) + " ");
        }

        System.out.println();

        System.out.println("Ersetze die Zahl an der Position 3 durch die Zahl 22");
        liste.replaceElement(3, 22);

        System.out.println("Gib jeweils das erste Elemente aus und entferne es aus der Liste bis diese leer ist:");

        while (!liste.isEmpty()) {
            System.out.print(liste.getFirst() + " ");
            liste.removeFirst();
        }
        System.out.println();

        for (int x = 10; x > 0; x--) {
            liste.addLast(x);
        }
        System.out.println("Die Zahlen wurden eingefügt");

        for (int x = 0; x < liste.getSize(); x++) {
            System.out.print(liste.getElement(x) + " ");
        }
        System.out.println();

    }

    public static void isEmpty() {
        if (liste.isEmpty()){
            System.out.println("Liste ist leer");
        } else {
            System.out.println("Liste ist nicht leer");
        }
    }
}
