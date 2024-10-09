package Arbeitsblatt_5_2;

public class Element<T>{
    private T value;
    private Element<T> nextElement;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Element<T> getNextElement() {
        return nextElement;
    }

    public void setNextElement(Element<T> nextElement) {
        this.nextElement = nextElement;
    }

    public Element(T value) {
        this.value = value;
        this.nextElement = null;
    }

    public Element(T value, Element<T> nextElement) {
        this.value = value;
        this.nextElement = nextElement;
    }
    
}