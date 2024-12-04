/*
(Find numbers divisible by 3 and 4) Write a program that displays all the numbers from 100 to 1000, ten per line,
that are divisible by 3 and 4. Numbers are separated by exactly one space.
 */

public class Section_5_10 {
    public static void main(String[] args) {
        int count = 0; // counter to track numbers per line, initial count @ 0

        // Loop through numbers from 100 to 1000;
        for (int i = 100; i <= 1000; i++) {
            // Check if the number is divisible by both 3 && 4
            if ( i % 3 == 0 && i % 4 == 0) {
                System.out.print(i + " "); // Print the number followed by a space
                count++; // increasing counter with +1 for each iteration

                // Print a new line after every 10 numbers
                if (count % 10 == 0) {
                    System.out.println();
                    // stops loop after "996" because next number is >= 1000 and that's when we told the loop to stop
                }
            }
        }

    }
}
