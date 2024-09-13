package Arbeitsblatt_1;
public class Gluecksspiel {
    public static int fakultaet(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fakultaet(n - 1);
        }
    }
    
    public static void main(String[] args) {
        int n = 6;
        int r = 2;
        int k = fakultaet(n) / (fakultaet(n - r) * fakultaet(r));
        System.out.println(k);
    }
}