package Black_Jack;

public class Card {
    private String color;
    private String value;

    public Card() {
    }

    public Card(String color, String value) {
        this.color = color;
        this.value = value;
    }

    public String getColor() {
        return this.color;
    }

    public String getValue() {
        return this.value;
    }

    public String toString() {
        return this.color + " " + this.value;
    }

    public void draw() {
        System.out.println("┌───────┐");
        System.out.println("| " + value + "     |");
        System.out.println("|       |");
        System.out.println("|   " + color + "   |");
        System.out.println("|       |");
        System.out.println("|     " + value + " |");
        System.out.println("└───────┘");
    }


}
