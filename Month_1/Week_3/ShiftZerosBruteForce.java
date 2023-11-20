package Month_1.Week_3;

import java.util.*;

public class ShiftZerosBruteForce {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 3, 0, 4, 0, 5 };
        int n = arr.length;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                al.add(arr[i]);
            }
        }

        for (int j = 0; j < al.size(); j++) {
            arr[j] = al.get(j);
        }
        for (int k = al.size(); k < n; k++) {
            arr[k] = 0;
        }
        for (int val : arr) {
            System.out.print(val + " ");
        }

    }
}
