package Arbeitsblatt_6_2;

import java.util.Arrays;

public class Element {
    private int value;
    private Element leftSubtree;
    private Element rightSubtree;

    public Element(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Element getLeftSubtree() {
        return leftSubtree;
    }

    public void setLeftSubtree(Element leftSubtree) {
        this.leftSubtree = leftSubtree;
    }

    public Element getRightSubtree() {
        return rightSubtree;
    }

    public void setRightSubtree(Element rightSubtree) {
        this.rightSubtree = rightSubtree;
    }

    public boolean isEnd() {
        if (leftSubtree == null && rightSubtree == null) {
            return true;
        }

        return false;
    }

    public void add(int value) {

        if (value >= this.value) {
            if (this.getRightSubtree() == null) {
                rightSubtree = new Element(value);
                return;
            }
            rightSubtree.add(value);
        } else {
            if (this.getLeftSubtree() == null) {
                leftSubtree = new Element(value);
                return;
            }
            leftSubtree.add(value);
        }

    }

    public void getDataInorder() {
        if (leftSubtree != null) leftSubtree.getDataInorder();
        System.out.print(" " + this.value + " ");
        if (rightSubtree != null) rightSubtree.getDataInorder();
    }

    public void getDataPreorder() {
        System.out.print(" " + this.value + " ");
        if (leftSubtree != null) leftSubtree.getDataPreorder();
        if (rightSubtree != null) rightSubtree.getDataPreorder();
    }

    public void getDataPostorder() {
        if (leftSubtree != null) leftSubtree.getDataPostorder();
        if (rightSubtree != null) rightSubtree.getDataPostorder();
        System.out.print(" " + this.value + " ");
    }

    public void testOutput_2D() {

    }
}
