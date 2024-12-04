/*
(Display prime numbers between 2 and 1,200)
Modify Listing 5.15 to display all the prime numbers between 2 and 1,200, inclusive.
Display eight prime numbers per line. Numbers are separated by exactly one space.
 */

public class Section_5_20 {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES_PER_LINE = 8;
        int count = 0;
        int number = 2;

        System.out.println("Prime numbers between 2 and 1,200:");

        while (number <= 1200) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;

                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    System.out.println();
                }
            }
            number++;
        }
    }
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
