/*
(Find the highest score) Write a program that prompts the uer to enter the number of students and each student's
name and score, and finally displays the name of the student with the highest score. Use the next() method in the
Scanner class to read a name, rahter than using the nextLine() method. Assume that the number of students is at least 1.
 */

// Scanner for user input
import java.util.Scanner;

public class Section_5_8 {
    public static void main(String[] args) {

        // Create new instance of scanner
        Scanner scanscan = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter the number of students: ");
        // Save user input as integer
        int numberOfStudents = scanscan.nextInt();

        // Initialize variable
        String highestScoreStudent = "";
        // Initialize initial variable
        int highestScore = 0;

        // Prompts user for input for i times
        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.print("Enter the student's name: ");
            String name = scanscan.next(); // use next() for a single name

            System.out.print("Enter the student's score: ");
            int score = scanscan.nextInt();

            // If given score is higher than given highestScore yet...
            if (score > highestScore) {
                // ... new highestScore is given score.
                highestScore = score;
                // and also saves the name of the student with the highest score.
                highestScoreStudent = name;
            }
        }

        // Validates who and how much.
        System.out.println("The student with the highest score is " + highestScoreStudent + " with a score of " + highestScore);

        // Closes data stream
        scanscan.close();

    }
}
