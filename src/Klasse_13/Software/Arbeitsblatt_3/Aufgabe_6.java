package Arbeitsblatt_3;

public class Aufgabe_6 {
    public static void main(String[] args) {

        int[] i = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        i = reverseArray(i);
        for (int s:i) {
            System.out.print(s + ", ");
        }
    }

    public static int[] reverseArray(int[] array) {
        int[] result = new int[array.length];

        if (array.length == 1){
            return array;
        }

        result[0] = array[array.length - 1];
        int [] reversed = reverseArray(arrayMinusOne(array));
        
        for (int i = 1; i < array.length; i++) {
            result[i] = reversed[i - 1];
        }

        return result;
    }
    
    public static int[] arrayMinusOne(int[] array) {
        int[] result = new int[array.length-1];
        for (int i = 0; i < array.length - 1; i++) {
            result[i] = array[i];
        }

        return result;
    }
}
