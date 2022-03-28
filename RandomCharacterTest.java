import static org.junit.Assert.*;
import org.junit.Test;

public class RandomCharacterTest {
    Character c;
    boolean flag;
    int testCount = 1000;

    public void reset() {
        c = null;
        flag = false;
    }

    @Test
    public void testRandomLowerCaseCharacter() {
        for (int i = 0; i < testCount; i++) {
            c = RandomCharacter.getRandomLowerCaseLetter();
            Character temp;
            flag = false;
            for (int j = 0; j < 26; j++) {
                temp = (char) ('a' + j);
                if (c == temp)
                    flag = true;
            }
            assertTrue(flag == true);
            reset();
        }
    }

    @Test
    public void testRandomUpperCaseCharacter() {
        for (int i = 0; i < testCount; i++) {
            c = RandomCharacter.getRandomUpperCaseLetter();
            Character temp;
            flag = false;
            for (int j = 0; j < 26; j++) {
                temp = (char) ('A' + j);
                if (c == temp)
                    flag = true;
            }
            assertTrue(flag == true);
            reset();
        }
    }

    @Test
    public void testRandomDigitCharacter() {
        for (int i = 0; i < testCount; i++) {
            c = RandomCharacter.getRandomDigitCharacter();
            Character temp;
            flag = false;
            for (int j = 0; j < 10; j++) {
                temp = Character.forDigit(j, 10);
                if (c == temp)
                    flag = true;
            }
            assertTrue(flag == true);
            reset();
        }
    }

    @Test
    public void testRandomCharacter() {
        for (int i = 0; i < testCount; i++) {
            c = RandomCharacter.getRandomCharacter();
            Character temp;
            flag = false;
            for (int j = 0; j < 26; j++) {
                temp = (char) ('a' + j);
                if (c == temp)
                    flag = true;
            }
            for (int j = 0; j < 26; j++) {
                temp = (char) ('A' + j);
                if (c == temp)
                    flag = true;
            }
            for (int j = 0; j < 10; j++) {
                temp = Character.forDigit(j, 10);
                if (c == temp)
                    flag = true;
            }
            assertTrue(flag == true);
            reset();
        }
    }
}
