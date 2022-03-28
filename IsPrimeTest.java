import static org.junit.Assert.*;

import java.util.concurrent.ThreadLocalRandom;

import org.junit.Before;
import org.junit.Test;

public class IsPrimeTest {
    int n;

    @Before
    public void setUp() {
        n = ThreadLocalRandom.current().nextInt(Integer.MAX_VALUE);
    }

    @Test
    public void testIsPrime() {
        n = 3;
        assertTrue(IsPrime.isPrime(n) == true);
        n = 13;
        assertTrue(IsPrime.isPrime(n) == true);
        n = 977636299;
        assertTrue(IsPrime.isPrime(n) == true);
        n = 1;
        assertFalse(IsPrime.isPrime(n) == true);
    }
}
