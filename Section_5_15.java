/*
(Display the ASCII character table)
Write a program that prints the characters in the ASCII character table from ! to ~. Display 10 character per line.
The ASCII table is given in Appendix B. Characters are separated by exactly one space.
 */

public class Section_5_15 {
    public static void main(String[] args) {
        int count = 0; // Counter to track characters per line

        // Loop through the ASCII values from "!" to "~"
        for (int i = 33; i <= 126; i++) {
            System.out.print((char) i + " " ); // Cast the ASCII value
            count++; // increase count by +1

            // Print a new line after every 10 characters
            if (count % 10 == 0) {
                System.out.println();
            }
        }

    }
}
