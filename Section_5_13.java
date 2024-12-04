/*
(Find the largest n such that n^2 < 12,000)
Use a while loop to find the largeset integer n such that n^2 is less than 12,000
*/

public class Section_5_13 {
    public static void main(String[] args) {
        // Set initial value
        int n = 0;

        // Use a while loop to find the largest n such that n^2 < 12000
        while (Math.pow(n, 2) < 12000) {
            n++;
        }

        // The last incremented n makes n^2 >= 12000, so we need to decrement n by 1
        n--;

        // Display the result
        System.out.println("The largest integer n such that n^2 < 12000 is: " + n);

    }
}
