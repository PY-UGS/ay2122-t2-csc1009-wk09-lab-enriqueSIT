import java.util.concurrent.ThreadLocalRandom;

public class RandomCharacter {

    public static Character getRandomLowerCaseLetter() {
        return (char) ('a' + ThreadLocalRandom.current().nextInt(26));
    }

    public static Character getRandomUpperCaseLetter() {
        return Character.toUpperCase(getRandomLowerCaseLetter());
    }

    public static Character getRandomDigitCharacter() {
        return Character.forDigit(ThreadLocalRandom.current().nextInt(10), 10);
    }

    public static char getRandomCharacter() {
        int coinFlip = ThreadLocalRandom.current().nextInt(3);
        return (coinFlip == 0) ? getRandomDigitCharacter()
                : (coinFlip == 1) ? getRandomLowerCaseLetter() : getRandomUpperCaseLetter();
    }

    public static void main(String[] args) {
        System.out.println("getRandomLowerCaseLetter:");
        for (int i = 0; i < 15; i++) {
            System.out.print(getRandomLowerCaseLetter() + " ");
        }
        System.out.println("");

        System.out.println("getRandomUpperCaseLetter:");
        for (int i = 0; i < 15; i++) {
            System.out.print(getRandomUpperCaseLetter() + " ");
        }
        System.out.println("");

        System.out.println("getRandomDigitCharacter:");
        for (int i = 0; i < 15; i++) {
            System.out.print(getRandomDigitCharacter() + " ");
        }
        System.out.println("");

        System.out.println("getRandomCharacter:");
        for (int i = 0; i < 15; i++) {
            System.out.print(getRandomCharacter() + " ");
        }
        System.out.println("");
    }
}
