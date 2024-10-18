package Arbeitsblatt_5_4;
import Arbeitsblatt_5_2.*;

public class Stack<T> {
    LinkedList<T> l;


    public Stack(){
        l = new LinkedList<T>();
    }

    public void push(T value){
        l.add(value);
    }

    public T top(){
        return l.getValue(l.length() - 1);
    }

    public T pop(){
        return l.removeLast().getValue();
    }

    public boolean isEmpty(){
        return l.isEmpty();
    }

    public int length(){
        return l.length();
    }

    public void print(){
        l.print();
    }
}
