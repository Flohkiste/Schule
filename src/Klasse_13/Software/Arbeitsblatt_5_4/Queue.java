package Arbeitsblatt_5_4;
import Arbeitsblatt_5_2.*;

public class Queue<T> {

    LinkedList<T> list;

    public Queue() {
        list = new LinkedList<T>();
    }

    public void enqueue(T value) {
        list.addFirst(value);
    }

    public T dequeue(){
        return list.removeFirst().getValue();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int length() {
        return list.length();
    }
}
