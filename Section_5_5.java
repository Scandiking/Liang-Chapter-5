/*
(Conversion from C to F and F to C) Write a program that displays the following two tables side by side:

Celsius     Fahrenheit      |      Fahrenheit      Celsius
0           32.000          |       20              -6.667
2           35.600          |       25              -3.889
...                         |
9           208.400         |       265             129.444
10          212.000         |       270             132.222
 */

public class Section_5_5 {
    public static void main(String[] args) {
        // Display the table header
        System.out.printf("%-10s %-12s | %-15s %-10s\n", "Celsius", "Fahrenheit", "Fahrenheit", "Celsius");
        System.out.println("------------------------|---------------------------");

        // Loop through the Celsius and Fahrenheit ranges
        int celsiusStart = 0;
        int fahrenheitStart = 20;

        // Iterate through loop 50 times
        for (int i = 0; i <= 50; i++) {
            // Calculate Fahrenheit for the Celsius column
            double fahrenheitFromCelsius = celsiusStart * 9.0 / 5 + 32;

            // Calculate Celsius from the Fahrenheit column
            double celsiusFromFahrenheit = (fahrenheitStart - 32) * 5.0 / 9;

            // Display the two tables side by side
            System.out.printf("%-10d %-12.3f | %-15d %-10.2f\n", celsiusStart, fahrenheitFromCelsius, fahrenheitStart, celsiusFromFahrenheit);

            // Increment values for the next row
            celsiusStart += 2;
            fahrenheitStart += 5;
        }
    }
}
