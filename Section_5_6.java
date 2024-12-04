/*
(Conversion from square meter to ping) Write a program that displays the following two tables side by side (note that 1 ping  = 3.305 square meters):

Ping        Square meter        |       Square meter        Ping
10          33.050              |       30                  9.077
15          49.575              |       35                  10.590
...                             |
75          247.875             |       95                  28.744
80          264.400             |       100                 30.257
 */

public class Section_5_6 {
    public static void main(String[] args) {
        // Display the table header
        System.out.printf("%-10s %-15s | %-20s %-10s\n", "Ping", "Square meter", "Square meter", "Ping");
        System.out.println("---------------------------|---------------------------");

        // Initialize the starting values for both columns
        int pingStart = 10;
        int squareMeterStart = 30;

        // Loop through the values for both tables
        for (int i = 0; i <= 7; i++) {
            // Calculate square meters from ping
            double squareMetersFromPing = pingStart * 3.305;

            // Calculate ping from square meters
            double pingFromSquareMeters = squareMeterStart / 3.305;

            // Display the two tables side by side
            System.out.printf("%-10d %-15.3f | %-20d %-10.3f\n", pingStart, squareMetersFromPing, squareMeterStart, pingFromSquareMeters);

            // Increment values for the next row
            pingStart += 5;
            squareMeterStart += 5;
        }
    }
}
