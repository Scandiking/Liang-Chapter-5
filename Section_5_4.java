/*
(Conversion from inch to centimeter)
Write a program that displays the following table (note that 1 inch is 2.54 centimeters)

Inches      Centimeters
 1           2.54
 2           5.08
...
 9          22.86
10          25.4
 */

public class Section_5_4 {
    public static void main(String[] args) {
        // Display the table header
        System.out.printf("%-10s| %-10s\n", "Inches", "Centimeters");
        System.out.println("----------|------------");

        for (int inch = 1; inch <= 10; inch++) {
            double centimeters = inch * 2.54;

            // Display inches and centimeters with formatting
            System.out.printf("%-10d| %-10.2f\n", inch, centimeters);
        }
    }
}
