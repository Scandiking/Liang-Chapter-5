/*
(Find the factors of an integer)
Write a program that reads an integer and displays all its smallest factors in an increasing  order.
For example, if the input integer is 120, the output should be as follows: 2, 2, 2, 3, 5
 */

// Read user input
import java.util.Scanner;

public class Section_5_16 {
    public static void main(String[] args) {
        Scanner scanscan = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanscan.nextInt();

        // Display the smallest factors
        System.out.print("The factors are: ");
        int factor = 2; // Start with the smallest prime factor

        while (number > 1 ) {
            // If the factor divides the number, print it and divide the number
            if (number % factor == 0) {
                System.out.print(factor + " " );
                number /= factor;
            } else {
                // Otherwise, move to the next factor
                // Increase factor counter with +2 as assigned in variable initialization
                factor++;
            }
        }

        // Close datastream
        scanscan.close();
    }
}
