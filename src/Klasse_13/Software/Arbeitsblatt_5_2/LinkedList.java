package Arbeitsblatt_5_2;

public class LinkedList<T>{
    Element<T> firstElement;
    int size;

    public LinkedList(){
        firstElement = null;
        size = 0;
    }

    public void addFirst(T value){
        Element<T> newElement = new Element<T>(value, this.firstElement);
        this.firstElement = newElement;
        size++;
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

        size++;
    }

    public void add(T value, int pos){
        Element<T> curElement = this.firstElement;

        for(int i = 0; i < pos - 1; i++){
            curElement = curElement.getNextElement();
        }

        curElement.setNextElement(new Element<T>(value, curElement.getNextElement()));
        size++;
    }

    public Element<T> removeFirst(){
        Element<T> removedElement = this.firstElement;

        if (size == 1){
            this.firstElement = null;
            size = 0;
            return removedElement;
        }

        this.firstElement = this.firstElement.getNextElement();
        size--;
        return removedElement;
    }

    public Element<T> removeLast(){
        Element<T> removedElement;

        if (size == 1){
            removedElement = this.firstElement;
            this.firstElement = null;
            size = 0;
            return removedElement;
        }

        Element<T> curElement = this.firstElement;

        for(int i = 0; i < size - 2; i++){
            curElement = curElement.getNextElement();
        }

        removedElement = curElement.getNextElement();

        curElement.setNextElement(null);
        size--;

        return removedElement;
    }

    public Element<T> remove(int pos){
        Element<T> removedElement;

        if (pos == 0){
            return removeFirst();
        }

        Element<T> curElement = this.firstElement;

        for(int i = 0; i < pos - 1; i++){
            curElement = curElement.getNextElement();
        }

        removedElement = curElement.getNextElement();

        curElement.setNextElement(curElement.getNextElement().getNextElement());
        size--;
        
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
        return this.size;
    }

}