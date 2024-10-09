package Arbeitsblatt_5_2;

public class LinkedList<T>{
    Element<T> firstElement;
    Boolean empty;
    int size;

    public LinkedList(){
        firstElement = null;
        empty = true;
        size = 0;
    }

    public void addFirst(T value){
        this.firstElement = new Element<T>(value, this.firstElement);
    }

    public void addLast(T value){
        
    }

    public void add(T value){
        
    }
}