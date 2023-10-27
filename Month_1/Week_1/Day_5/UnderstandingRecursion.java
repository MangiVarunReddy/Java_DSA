package Month_1.Week_1.Day_5;

import java.util.Scanner;

public class UnderstandingRecursion {

    public static void printVarun(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.println("Varun Reddy");
            printVarun(n - 1);
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        printVarun(n);
    }
}
