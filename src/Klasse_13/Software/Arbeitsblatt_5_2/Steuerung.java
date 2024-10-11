package Arbeitsblatt_5_2;

public class Steuerung {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.print();

        list.add(6);
        list.add(10);
        list.print();

        list.remove(1);
        list.print();
    }
}