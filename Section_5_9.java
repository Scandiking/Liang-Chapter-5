/*
(Find the two lowest scores) Write a program that prompts the user to enter the number of students and each student's
name and score, and finally displays the na,es of the students with thje lowest and second-lowest scores.
 */

// To read user input
 import java.util.Scanner;

public class Section_5_9 {
    public static void main(String[] args) {
        // Create new instance of the scanner object
        Scanner scanscan = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        // Save input
        int numberOfStudents = scanscan.nextInt();

        // Variables to track the two lowest scores and their corresponding names
        // Assigning variables with empty strings
        String lowestScoreStudent = "";
        String secondLowestScoreStudent = "";
        int lowestScore = Integer.MAX_VALUE;
        int secondLowestScore = Integer.MAX_VALUE;

        // Loop through the number of students to get their names and scores (if 100 students will loop 100 times)
        for (int i = 1; i <= numberOfStudents; i++) {
            // Prompts user to enter information
            System.out.print("Enter the student's name: ");
            // Saves this information to the variable
            String name = scanscan.next();

            System.out.print("Enter the student's score: ");
            int score = scanscan.nextInt();

            // Compares scores for each iteration
            if (score < lowestScore) {
                secondLowestScore = lowestScore;
                secondLowestScoreStudent = lowestScoreStudent;

                // Update the lowest score and name
                lowestScore = score;
                lowestScoreStudent = name;
            } else if (score < secondLowestScore) {
                // Update second lowest only
                secondLowestScore = score;
                secondLowestScoreStudent = name;
            }
        }

        // Display the students with the lowest and second-lowest score
        System.out.println("The student with the lowest score is " + lowestScoreStudent + " with a score of " + lowestScore);
        System.out.println("The student with the second lowest score is " + secondLowestScoreStudent + " with a score of " + secondLowestScore);

        // Closes data stream
        scanscan.close();

    }
}
