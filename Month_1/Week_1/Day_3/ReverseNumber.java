package Month_1.Week_1.Day_3;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = sc.nextInt();

        int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        System.out.println(rev);
    }

}
