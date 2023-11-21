package Month_1.Week_3.Day_2;

import java.util.*;

public class UnionBruteForce {
    public static boolean linearSearch(int arr[], int n, int key) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4 };
        int arr2[] = { 4, 5, 3, 2, 6, 7 };

        int n1 = arr1.length;
        int n2 = arr2.length;

        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n1; i++) {
            al.add(arr1[i]);
        }
        for (int j = 0; j < n2; j++) {
            boolean result = linearSearch(arr1, n1, arr2[j]);
            if (result != true) {

                al.add(arr2[j]);
            }
        }

        for (int val : al) {
            System.out.print(val + " ");
        }

    }
}
