// This is a brute force approach which i have tried. But this algorithm 
//fails in few cases

package Month_1.Week_3.Day_4;

import java.util.*;

public class LongestSumSubArray {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5 };
        int key = 5;
        int n = arr.length;
        int sum = 0;
        int k = 0;

        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (sum + arr[i] == key) {
                sum = sum + arr[i];
                k++;
                al.add(k);
                k = 0;
                sum = 0;

            } else if (sum + arr[i] <= key) {
                sum = sum + arr[i];
                k++;
            } else {
                k = 0;
                sum = 0;
            }
        }
        int m = 0;
        for (int val : al) {
            if (val > m) {
                m = val;
            }
        }

        System.out.println(m);
    }
}
