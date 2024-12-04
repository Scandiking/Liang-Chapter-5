/*
(Find the smallest n such that n^2 > 12,000)
Use a while loop to find the smallest integer n such that n^3 is greater than 12,000
 */

public class Section_5_12 {
    public static void main(String[] args) {
        int n = 1; // Start with the smallest possible integer

        // Use a while loop to find the smallest n such that n^3 > 12000
        // While this is true...
        while (Math.pow(n, 3) <= 12000) {

            // ... increase n with +1
            n++;
        }

        // Display the result
        System.out.println("The smallest ineger n such that n^3 > 120000 is: " + n);

        // 23 * 23 * 23 = 12167

    }
}
