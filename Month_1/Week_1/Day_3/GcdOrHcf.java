package Month_1.Week_1.Day_3;

import java.util.Scanner;

public class GcdOrHcf {
    public static void main(String[] args) {
        int a;
        int b;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = sc.nextInt();
        System.out.println("Enter b: ");
        b = sc.nextInt();
        int temp;
        int m = a;
        int n = b;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;

        }
        System.out.println("The GCD of " + m + " and " + n + " are: " + a);
    }
}
