/*
(Pass or fail) Write a program that prompts a student to enter a Java score.
If the score is greater or equal to 60, display "you pass the exam"; otherwise, display "you don't pass the exam".
Your program ends with input -1.
 */

// Scanner for user input
import java.util.Scanner;

public class Section_5_1 {
    public static void main(String[] args) {
        // Create new scanner instance
    Scanner scanscan = new Scanner(System.in);
    // Initial score
    int score;

    // While loop to keep program running until user presses -1
    while (true) {
        // Prompts user for input
        System.out.print("Enter your Java score (-1 to end): ");

        // Reads user input
        score = scanscan.nextInt();

        // If score == -1, prints program end and break out of loop.
        if (score == -1) {
            System.out.println("Program ended. ");
            break;
        }

        // If score >= 60, tells user it passed the exam.
        if (score >= 60) {
            System.out.println("You pass the exam.");
        // In the other cases, user gets told it did not pass the exam,
        } else {
            System.out.println("You don't pass the exam.");
        }
    }

    // Closes data stream
    scanscan.close();


}
}