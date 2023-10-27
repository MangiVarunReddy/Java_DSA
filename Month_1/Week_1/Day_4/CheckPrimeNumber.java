package Month_1.Week_1.Day_4;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        int x = 0;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                x = 1;
                break;
            }
        }
        System.out.println(x);
        if (x == 0) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }
    }
}
