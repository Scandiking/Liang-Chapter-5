/*
(Find numbers divisible by 3 OR 4, but not both) Write a program that displays all the numbers from 100 to 200,
ten per line, that are divisible by 3 or 4, but not both. Numbers are separated by exactly one space.
 */
public class Section_5_11 {
    public static void main(String[] args) {
        // Set initial counter
        int count = 0;

        // Loop through numbers from 100 to 200
        for (int i = 100; i <= 200; i++) {
            // Check if the number is divisible by 3 or 4 but not both, for 200-100 times
            // If true then...
            if ((i % 3 == 0 || i % 4 == 0) && !(i % 3 == 0 && i % 4 == 0)) {
                // ... print the i and space
                System.out.print(i + " "); // Print the number followed by exactly one space
                // and increase counter with +1
                count++;

                // Print a new line after every 10 numbers by checking if count can be modulo divided by 10 and yield
                // 0 as the result, if so then println()
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }

    }
}
