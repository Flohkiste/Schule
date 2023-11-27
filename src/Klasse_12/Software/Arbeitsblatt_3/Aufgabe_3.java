package Klasse_12.Software.Arbeitsblatt_3;

public class Aufgabe_3 {
    public double median(double x, double y, double z) {
        // Regel 1: Überladen durch unterschiedliche Anzahl von Parametern
        return (x + y + z) / 3;
    }

    public double median(double x, double y) {
        // Regel 2: Überladen durch unterschiedliche Datentypen der Parameter
        return (x + y) / 2;
    }

    public double median(double[] values) {
        // Regel 3: Überladen durch unterschiedliche Parameterarten
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.length;
    }

    public int max(int x, int y, int z) {
        // Regel 1: Überladen durch unterschiedliche Anzahl von Parametern
        return Math.max(x, Math.max(y, z));
    }

    public int max(int[] values) {
        // Regel 2: Überladen durch unterschiedliche Parameterarten
        int max = Integer.MIN_VALUE;
        for (int value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public int max(int x, int y) {
        // Regel 3: Überladen durch unterschiedliche Datentypen der Parameter
        return Math.max(x, y);
    }
}
