package Arbeitsblatt_5_1;

import java.util.LinkedList;

public class Steuerung {

    static LinkedList<Tier> aHaustiere = new LinkedList();

    public static void main(String[] args) {
        aHaustiere.add(new Hund("Coco"));
        aHaustiere.add(new Katze("Mimi"));
        aHaustiere.add(new Maus("Fritzi"));

        System.out.println(aHaustiere.set(0, new Katze("Simba")).getName() + " wurde entfernt.");
        aHaustiere.add(1, new Hund("Bello"));
        aHaustiere.addLast(new Maus("Speedy"));
        System.out.println("Die Liste enthält " + aHaustiere.size() + " Haustiere.");

        for (Tier lTier : aHaustiere) {
            System.out.print(lTier.getName() + ", ");
        }
        System.out.println();

        Hund h1 = new Hund("Luna");
        aHaustiere.add(3, h1);
        System.out.println(h1.getName() + " steht an " + aHaustiere.indexOf(h1) + ". Stelle.");

        while (!aHaustiere.isEmpty()) {
            System.out.println(aHaustiere.removeFirst().getName() + " wurde entfernt.");            
        }
    }
}
