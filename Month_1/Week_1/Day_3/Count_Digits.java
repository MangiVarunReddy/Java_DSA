package Month_1.Week_1.Day_3;

import java.util.Scanner;

public class Count_Digits {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        // int x = n;
        // System.out.println("The number is: " + n);
        // int count = 0;
        // while (x != 0) {
        // count++;
        // x = x / 10;

        // }
        // System.out.println("Digits present in " + n + " are: " + count);
        System.out.println("Digits present in " + n + " are: " + (int) Math.floor(Math.floor(Math.log10(n)) + 1));
    }

}
