package Arbeitsblatt_3;

public class Aufgabe_2 {
    

    public static int reverse(int n){
        int length = String.valueOf(n).length();

        if (length == 1) {
            return n;
        } else {
            int lastDigit = n % 10;
            int rest = n / 10;
            return lastDigit * (int) Math.pow(10, length - 1) + reverse(rest);
        }
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println(reverse(n));
    }
}
