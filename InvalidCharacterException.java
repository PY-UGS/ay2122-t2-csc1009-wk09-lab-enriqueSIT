public class InvalidCharacterException extends Exception {

    private char c;

    public InvalidCharacterException(char c) {
        this.c = c;
    }

    public double getChar() {
        return c;
    }
}