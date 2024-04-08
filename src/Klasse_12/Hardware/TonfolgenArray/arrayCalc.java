package Klasse_12.Hardware.TonfolgenArray;

public class arrayCalc {

    public static int hzToARR(int hz) {
        int x = (int) ((((1/hz) * 32000000 - 1)/32)*0.5);
        return x;
    }

    public static int tonToHZ(String ton){
        
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Summe: " + sum);
    }
}