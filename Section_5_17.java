/*
(Display pyramid)
Write a program that prompts the user to enter an integer from 1 to 15 and displays a pyramid as shown:

7 6 5 4 3 2 1 2 3 4 5 6 7
6 5 4 3 2 1 2 3 4 5 6
5 4 3 2 1 2 3 4 5
4 3 2 1 2 3 4
3 2 1 2 3
2 1 2
1

*/

import java.util.Scanner;

public class Section_5_17 {
    public static void main(String[] args) {
        Scanner scanscan = new Scanner(System.in);

        // Prompt the user to enter an integer between 1 and 15
        System.out.print("Enter an integer between 1 and 15: ");
        int rows = scanscan.nextInt();

        // Validate input
        if (rows < 1 || rows > 15) {
            System.out.println("Invalid input. Please enter a number between 1 and 15.");
            return;
        }

        // Generate the pyramid
        for (int i = rows; i >= 1; i--) {
            // Print the numbers in the current row
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            // Move to the next line
            System.out.println();
        }

        scanscan.close();
    }
}
