import java.util.Random;

public class Lottozahlen{
    public static void main(String[] args){
        Random rand = new Random();
        int lottozahlen[] = new int[6];

        for(int x = 0; x < 6; x++){
            lottozahlen[x] = getRandomWithExclusion(rand, 1, 49, lottozahlen);
        }

        int zusatzzahl = getRandomWithExclusion(rand, 1, 49, lottozahlen);

        for(int x = 0; x < 6; x++){
            System.out.println("Die " + (x+1) + ". Lottozahl lautet: " + lottozahlen[x]);
        }

        System.out.println("Die Zusatzzahl lautet: " + zusatzzahl);

    }

    public static int getRandomWithExclusion(Random rnd, int start, int end, int... exclude) {
    int random = start + rnd.nextInt(end - start + 1 - exclude.length);
    for (int ex : exclude) {
        if (random < ex) {
            break;
        }
        random++;
    }
    return random;
}
}