package Month_1.Week_1.Day_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DivisorsOfNumber {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                int x = n / i;
                al.add(i);
                if (i == x) {
                    continue;
                } else {

                    al.add(x);
                }
            }
        }
        Collections.sort(al);
        System.out.println(al);
    }
}
