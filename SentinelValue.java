import java.util.Scanner;

public class SentinelValue {
    // main method
    public static void main(String[] args) {
        Scanner scanscan = new Scanner(System.in);
        System.out.println("Enter an integer (the input ends if it is 0): ");
        int data = scanscan.nextInt();

        // Keep reading data until the input is 0
        int sum = 0;
        while (data != 0) {
            sum += data;

            // Read the next data
            System.out.print("Enter an integer (the input ends if it is 0): ");
            data = scanscan.nextInt();
        }

        System.out.println("The sum is " + sum);
    }
}
