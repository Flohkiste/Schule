package Arbeitsblatt_3;

public class Aufgabe_5 {
    public static void main(String[] args) {
        System.out.println(countChar("Hallo Welt"));
    }

    public static int countChar(String word) {
        if (word.equals("")){
            return 0;
        }

        return countChar(word.replaceAll(".$", "")) + 1;
    }

}
