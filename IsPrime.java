public class IsPrime {
    public static boolean isPrime(int number) {
        // Ignore values < 2 as they are not primes.
        if (number < 2)
            return false;

        // Check if prime. If a divisor is found, return 0. Abort by returning false.
        for (int p = 2; p < Math.sqrt(number); p++) {
            if (number % p == 0)
                return false;
        }
        // No factors smaller than sqrt(n), thus this is a prime. Return true.
        return true;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println("is " + n + " prime? Answer: " + isPrime(n));
        n = 13;
        System.out.println("is " + n + " prime? Answer: " + isPrime(n));
        n = 977636299;
        System.out.println("is " + n + " prime? Answer: " + isPrime(n));
        n = 1;
        System.out.println("is " + n + " prime? Answer: " + isPrime(n));
    }
}
