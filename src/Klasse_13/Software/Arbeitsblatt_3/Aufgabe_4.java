package Arbeitsblatt_3;

public class Aufgabe_4 {
    public static void main(String[] args) {
        System.out.println(power(2, 8));
    }

    public static int power(int a, int b) {
        if (b <= 0){
            return 1;
        }

        return power(a, b - 1) * a;
    }
}
