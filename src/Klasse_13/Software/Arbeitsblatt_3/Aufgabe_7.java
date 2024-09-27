package Arbeitsblatt_3;

public class Aufgabe_7 {
    public static void main(String[] args) {
        System.out.println(collatzSteps(7));
    }

    public static int collatzSteps(int i) {
        if (i <= 1){
            return 0;
        }

        if (i % 2 == 0){
            i = i / 2;
        } else {
            i = i * 3 + 1;
        }

        return collatzSteps(i) + 1;

    }
}
