package Arbeitsblatt_5_2;

public class LinkedList<T>{
    Element<T> firstElement;

    public LinkedList(){
        firstElement = null;
    }

    public void addFirst(T value){
        Element<T> newElement = new Element<T>(value, this.firstElement);
        this.firstElement = newElement;
    }

    public void add(T value){
        if(this.isEmpty()){
            this.firstElement = new Element<T>(value);
        }else{
            Element<T> curElement = this.firstElement;

            while(curElement.getNextElement() != null){
                curElement = curElement.getNextElement();
            }

            curElement.setNextElement(new Element<T>(value));
        }

    }

    public void add(T value, int pos){
        Element<T> curElement = this.getElement(pos - 1);

        curElement.setNextElement(new Element<T>(value, curElement.getNextElement()));
    }

    public Element<T> removeFirst(){
        Element<T> removedElement = this.firstElement;

        if (length() == 1){
            this.firstElement = null;
            return removedElement;
        }

        this.firstElement = this.firstElement.getNextElement();
        return removedElement;
    }

    public Element<T> removeLast(){
        Element<T> removedElement;

        if (length() == 1){
            removedElement = this.firstElement;
            this.firstElement = null;
            return removedElement;
        }

        Element<T> curElement = this.getElement(length() - 2);

        removedElement = curElement.getNextElement();

        curElement.setNextElement(null);

        return removedElement;
    }

    public Element<T> remove(int pos){
        Element<T> removedElement;

        if (pos == 0){
            return removeFirst();
        }

        Element<T> curElement = this.getElement(pos - 1);

        removedElement = curElement.getNextElement();

        curElement.setNextElement(curElement.getNextElement().getNextElement());
        
        return removedElement;
    }

    public void print(){
        Element<T> curElement = this.firstElement;

        System.out.print("[");

        while (curElement != null){
            System.out.print(curElement.getValue() + (curElement.getNextElement() != null ? ", " : ""));
            curElement = curElement.getNextElement();
        }

        System.out.println("]");
    }

    public Boolean isEmpty(){
        if (this.firstElement == null) {
            return true;
        }

        return false;
    }

    public int length(){
        if (this.isEmpty()){
            return 0;
        }

        int x = 1;
        Element curElement = this.firstElement;

        while(curElement.getNextElement() != null) {
            curElement = curElement.getNextElement();
            x ++;
        }

        return x;
    }

    public Element getElement(int index) {

        if (this.isEmpty()){
            return null;
        }

        Element<T> curElement = this.firstElement;

        for(int i = 0; i < index; i++){
            curElement = curElement.getNextElement();
        }

        return curElement;
    }

    public T getValue(int index) {
        Element element = getElement(index);

        if (element == null) {
            return null;
        }
        
        return (T) getElement(index).getValue();
    }

}