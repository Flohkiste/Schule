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

    public String getDataInorder() {
        String result = "";
        if (leftSubtree != null) result = result + leftSubtree.getDataInorder();
        result = result + this.value + "  ";
        if (rightSubtree != null) result = result + leftSubtree.getDataInorder();

        return result;
    }

    public String getDataPreorder() {
        String result = "";
        result = result + this.value;        
        if (leftSubtree != null) result = result + leftSubtree.getDataPreorder();
        if (rightSubtree != null) result = result + leftSubtree.getDataPreorder();

        return result;
    }

    public String getDataPostorder() {
        String result = "";
        if (leftSubtree != null) result = result + leftSubtree.getDataPostorder();
        if (rightSubtree != null) result = result + leftSubtree.getDataPostorder();
        result = result + this.value;

        return result;
    }

    public void testOutput_2D() {

    }

    public void del(int num) {
        if (this.value != num) {
            if (this.rightSubtree != null) {
                this.rightSubtree.del(num);
            }

            if (this.leftSubtree != null) {
                this.leftSubtree.del(num);
            }
            
            return;
        }

        if (this.rightSubtree != null) {

            if (this.rightSubtree.value != num) {
                return;
            }

            if (this.rightSubtree.isEnd()) {                    
                    this.rightSubtree = null;      
                    return;                              

            } else if ((this.rightSubtree.rightSubtree != null | this.rightSubtree.leftSubtree != null) && !(this.rightSubtree.rightSubtree == null && this.rightSubtree.leftSubtree == null)){

                if (this.rightSubtree.rightSubtree != null) {
                    this.rightSubtree = this.rightSubtree.rightSubtree;
                }
                if (this.rightSubtree.leftSubtree != null) {
                    this.rightSubtree = this.rightSubtree.leftSubtree;
                }
            }
            
        }


    }

    private void delOneSubTree(int num) {

    }

    private void delInnerElement(int num) {

    }
}
