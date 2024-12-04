/*
(Financial application: compute future tuition) Suppose that the tuition for a university is $10,000 this year and
increases 6% every year. Inone year, the tuition will be $10,600. Write a program that computes the tuition in ten years
and the total cost of four years' worth of tuition after the tenth year.
 */

public class Section_5_7 {
    public static void main(String[] args) {
        double tuition = 10000;
        double annualIncreaseRate = 0.06;

        for (int year = 1; year <= 10; year++) {
            tuition *= (1 + annualIncreaseRate);
        }

        System.out.printf("Tuition in 10 years: $%.2f\n", tuition);

        double totalCost = 0;
        for (int year = 1; year <= 4; year++) {
            totalCost += tuition;
            tuition *= (1 + annualIncreaseRate);
        }

        System.out.printf("Total cost for 4 years after the 10th year: $%.2f\n", totalCost);

    }
}
