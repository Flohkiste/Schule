package Arbeitsblatt_5_2;
import Arbeitsblatt_5_4.*;
import java.util.Scanner;

public class Steuerung {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Geben Sie 1 für LinkedList oder 2 für Stack oder 3 für Queue ein:");
            int input = scanner.nextInt();

            if (input == 1) {
                outputLinkedList();
            } else if (input == 2) {
                outputStack();
            } else if (input == 3){
                outputQueue();
            }
        }
        
    }

    public static void outputStack(){
        System.out.println("Stack");

        Stack<Double> stack = new Stack<Double>();

        for(double x = 1; x < 5; x++) {
            stack.push(x);
        }

        System.out.println("Erledigt");

        System.out.println("Gib das oberste Element OHNE zu löschen aus:");
        System.out.println(stack.top());

        System.out.println("Gib das oberste Element OHNE zu löschen aus:");
        System.out.println(stack.top());

        System.out.println("Gib das oberste Element OHNE zu löschen aus:");
        System.out.println(stack.top());

        System.out.println("Gib das oberste Elemnt aus und lösche es gleichzeitig");
        System.out.println(stack.pop());

        System.out.println("Gib das oberste Elemnt aus und lösche es gleichzeitig");
        System.out.println(stack.pop());

        System.out.println("Gib das oberste Elemnt aus und lösche es gleichzeitig");
        System.out.println(stack.pop());

        System.out.println("Gib das oberste Elemnt aus und lösche es gleichzeitig");
        System.out.println(stack.pop());

        System.out.println("Ist der Stack leer?");
        System.out.println(stack.isEmpty());
    }

    public static void outputLinkedList(){

    }

    public static void outputQueue(){
            System.out.println("Queue");

            Queue<Double> queue = new Queue<Double>();

            for(double x = 1; x < 5; x++) {
                queue.enqueue(x);
            }

            System.out.println("Erledigt");

            System.out.println("Gib das erste Element aus und lösche es gleichzeitig");
            System.out.println(queue.dequeue());

            System.out.println("Gib das erste Element aus und lösche es gleichzeitig");
            System.out.println(queue.dequeue());

            System.out.println("Gib das erste Element aus und lösche es gleichzeitig");
            System.out.println(queue.dequeue());

            System.out.println("Gib das erste Element aus und lösche es gleichzeitig");
            System.out.println(queue.dequeue());

            System.out.println("Ist die Queue leer?");
            System.out.println(queue.isEmpty());
    }
}