/*
(Display numbers in a pyramid pattern) Write a nested for loop that prints the following output:
                    1
                1   3    1
            1   3   9    3   1
         1  3   9   27   9   3   1
      1  3  9   27  81   27  9   3  1
    1 3  9  27  81  243  81  27  9  3  1
  1 3 9  27 81  243 729  243 81  27 9  3 1
1 3 9 27 81 243 729 2187 729 243 81 27 9 3 1
 */

public class Section_5_19 {
    public static void main(String[] args) {
        int rows = 8;

        for (int i = 0; i < rows; i++) {
            // Print leading spaces
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print("    ");
            }

            // Print the left side of the world
            for (int j = 0; j <= i; j++) {
                System.out.printf("%-4d", (int) Math.pow(3, j));
            }

            // Print the right side of the pyramid
            for (int j = i - 1; j >= 0; j--) {
                System.out.printf("%-4d", (int) Math.pow(3, j));
            }

            // Move to the next line
            System.out.println();
        }

    }
}
