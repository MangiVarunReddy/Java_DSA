package Month_1.Week_1.Day_3;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        n = sc.nextInt();
        int noOfDogits = (int) Math.floor(Math.log10(n) + 1);
        int sum = 0;
        int x = n;
        while (x != 0) {
            int rem = x % 10;
            sum = (int) (sum + Math.pow(rem, noOfDogits));
            x = x / 10;
        }
        System.out.println("sum: " + sum);
        System.out.println("n: " + n);
        if (n != sum) {

            System.out.println("this is not an Amstrong number");
        } else {
            System.out.println("Yes this is an amstrong number");
        }

    }
}
