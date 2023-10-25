package Month_1.Week_1.Day_3;

import java.util.Scanner;

public class CheckPalindrome {
    public static int reverseNumber(int n) {

        int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        return rev;

    }

    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check the Palindrome: ");
        num = sc.nextInt();

        int revNum = CheckPalindrome.reverseNumber(num);
        if (num == revNum) {
            System.out.println("Yes!!! " + num + " is a palindrome number");
        } else {
            System.out.println("NO!!! " + num + " is a not a palindrome number");
        }

    }
}
