/*
(Display four patterns using loops) Use nested loops that display the following patterns in four separate programs:

Pattern A
*
* *
* * *
* * * *
* * * * *
* * * * * *

Pattern B
* * * * * *
* * * * *
* * * *
* * *
* *
*

Pattern C
          *
        * *
      * * *
    * * * *
  * * * * *
* * * * * *

Pattern D
* * * * * *
  * * * * *
    * * * *
      * * *
        * *
          *
 */


public class Section_5_18 {
    public static void main(String[] args) {
        System.out.println("Pattern A");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\nPattern B");
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\nPattern C");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print("  "); // Print spaces for alignment
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\nPattern D");
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print("  "); // Print spaces for alignment
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
