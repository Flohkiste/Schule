package Arbeitsblatt_6_2;

public class BinarySearchTree {

    Element root;

    public BinarySearchTree() {
        root = null;
    }

    public BinarySearchTree(int value) {
        root = new Element(value);
    }

    public Element getRoot() {
        return root;
    }

    public boolean isEmpty() {
        if (root == null) {
            return true;
        }
        
        return false;
    }

    public void add(int value) {
        if (this.isEmpty()) {
            root = new Element(value);
            return;
        }

        root.add(value);
    }

    public void outputDataInorder() {
        root.getDataInorder();
    }

    public void outputDataPreorder() {
        root.getDataPreorder();
    }

    public void outputDataPostorder() {
        root.getDataPostorder();
    }

    public void testOutput() {
        
    }

    public void testOutput_2D() {

    }
}
