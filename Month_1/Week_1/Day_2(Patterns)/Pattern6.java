/*
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
 */

package Month_1.Week_1.Day_2;

public class Pattern6 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= 2 * n; i++) {

            if (i <= n) {

                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int k = 1; k <= i - n - 1; k++) {
                    System.out.print(" ");
                }
                for (int q = 1; q <= 2 * n - (2 * (i - n) - 1); q++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
// This the end of Pattern Programs. If have good a good Knowledge in writing
// loops.