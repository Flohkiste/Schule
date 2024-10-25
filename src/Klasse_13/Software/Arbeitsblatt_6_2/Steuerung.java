package Arbeitsblatt_6_2;

public class Steuerung {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree(5);

        for (int x = 0; x < 10; x++) {
            tree.add(x);
        }

        tree.outputDataInorder();
    }
}
