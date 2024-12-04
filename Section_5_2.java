/*
(Repeat multiplication) Listing 5.4, SubtractionQuizLoop.java, generates five random subtraction questions. Revise the program to generate ten random multiplication questions for two integers between 1 and 12. Display the correct count and test time.
 */

// Read user input
import java.util.Scanner;

public class Section_5_2 {
    public static void main(String[] args) {
        // set number of questions to ten
        final int NUMBER_OF_QUESTIONS = 10;
        // set initial counter of correct guesses
        int correctCount = 0;
        // set initial counter of guesses at all
        int count = 0;
        // set startTime
        long startTime = System.currentTimeMillis();
        String output = "";
        // Create new instance of the scanner object
        Scanner scanscan = new Scanner(System.in);

        // Loop for ten questions
        while (count < NUMBER_OF_QUESTIONS) {
            // Generate a random number
            int number1 = (int) (Math.random() * 12) + 1;
            // Generate a random number
            int number2 = (int) (Math.random() * 12) + 1;

            // Prompt user for input
            System.out.print("What is " + number1 + " * " + number2 + "? ");
            // Save input
            int answer = scanscan.nextInt();

            // Grade the answer and display the result
            // If answer equals numbers multiplcated, greet user
            if (number1 * number2 == answer) {
                System.out.println("You are correct!");
                // and increase the correctCount counter with +1
                correctCount++; // Increase the correct answers count
            } else {
                // Else, tell user guess is wrong, and show what the right answer would be
                System.out.println("Your answer is wrong.\n" + number1 + " * " + number2 + " should be " + (number1 * number2));
            }

            // Increase the question count
            count++;

            // Save the result for this question in the output string
            output += "\n" + number1 + " * " + number2 + " = " + answer + ((number1 * number2 == answer) ? " correct" : " wrong");
        }

        // Record the end time
        long endTime = System.currentTimeMillis();
        // Take the endtime, subtract the start time from it and get the test time
        long testTime = endTime - startTime;

        // Display the results
        System.out.println("\nCorrect count is " + correctCount + "\nTest time is " + testTime / 1000 + " seconds\n" + output);
    }
}
