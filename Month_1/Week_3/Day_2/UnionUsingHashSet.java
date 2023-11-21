package Month_1.Week_3.Day_2;

import java.util.*;

public class UnionUsingHashSet {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4 };
        int arr2[] = { 4, 5, 3, 2, 6, 7 };

        int n1 = arr1.length;
        int n2 = arr2.length;

        HashSet<Integer> h = new HashSet<>();
        for (int i = 0; i < n1; i++) {
            h.add(arr1[i]);
        }
        for (int j = 0; j < n2; j++) {
            h.add(arr2[j]);
        }

        for (int val : h) {
            System.out.print(val + " ");
        }
    }
}