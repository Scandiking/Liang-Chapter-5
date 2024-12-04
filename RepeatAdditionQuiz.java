import java.util.Scanner;

public class RepeatAdditionQuiz {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        // Create a scanner
        Scanner scanscan = new Scanner(System.in);

        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = scanscan.nextInt();

        while (number1 + number2 != answer) {
            System.out.println("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
            answer = scanscan.nextInt();
        }

        System.out.println("You got it!");
    }
}
