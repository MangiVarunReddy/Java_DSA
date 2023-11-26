package Month_1.Week_3.Day_2;

import java.util.*;

public class UnionUsingTwoPointer {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4 };
        int arr2[] = { 2, 4, 5, 6 };
        int n = arr1.length;
        int m = arr2.length;

        int i = 0;
        int j = 0;

        ArrayList<Integer> al = new ArrayList<>();

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                if (al.size() == 0 || al.get(al.size() - 1) != arr1[i]) {
                    al.add(arr1[i]);
                }
                i++;
            } else {
                if (al.size() == 0 || al.get(al.size() - 1) != arr2[j]) {
                    al.add(arr2[j]);
                }
                j++;
            }
        }
        while (i < n) {
            if (al.get(al.size() - 1) != arr1[i]) {
                al.add(arr1[i]);
            }
            i++;
        }

        while (j < m) {
            if (al.get(al.size() - 1) != arr2[j]) {
                al.add(arr2[j]);
            }
            j++;
        }

        for (int val : al) {
            System.out.print(val + " ");
        }

    }
}
