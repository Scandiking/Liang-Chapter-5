/*
(Compute the greatest common divisor) Another solution for Listing 5.9 to find the greatest common divisor of two
integers n1 and n2 is as follows: First find d to be the minimum of n1 and n2, then check whether d, d-1, d-2, ..., 2,
or 1 is a divisor for both n1 and n2 in this order. The first such common divisor is the greats common divisor for
n1 and n2. Write a program that prompts the user to enter two positive integers and displays the gcd.
 */

// Read user input
import java.util.Scanner;

public class Section_5_14 {
    public static void main(String[] args) {
        // Create new instance of scanner object
        Scanner scanscan = new Scanner(System.in);

        // Prompts the user to enter two positive integers
        System.out.print("Enter the first positve integer: ");
        // Save user input
        int n1 = scanscan.nextInt();
        System.out.print("Enter the second positve integer: ");
        // Save user input
        int n2 = scanscan.nextInt();

        // Find the minimum of n1 and n2
        int d = Math.min(n1, n2);

        // FInd the GCD by checking divisors from d to 1
        // As long as d > 0 keep checking if...
        while (d > 0) {
            // ... break when true
            if (n1 % d == 0 && n2 % d == 0) {
                break;
            }
            // Decrement d by 1
            d--;
        }

        // Display the reuslt
        System.out.println("The greatest common divisor of " + n1 + " and " + n2 + " is " + d);

        // Close datastream
        scanscan.close();


    }
}
