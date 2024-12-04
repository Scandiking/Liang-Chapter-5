public class Section_5_3 {
    public static void main(String[] args) {
        // Display the table header
        System.out.printf("%-10s| %-10s\n", "Celsius", "Fahrenheit");
        System.out.println("----------|-----------");

        // Loop through Celsius values from 0 to 100 in increments of 2
        for (int celsius = 0; celsius <= 100; celsius += 2) {
            // Calculate Fahrenheit
            double fahrenheit = celsius * 9.0 / 5 + 32;

            // Display Celsius and Fahrenheit values with consistent formatting
            System.out.printf("%-10d| %-10.1f\n", celsius, fahrenheit);
        }
    }
}
