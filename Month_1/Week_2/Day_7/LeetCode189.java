package Month_1.Week_2.Day_7;

public class LeetCode189 {

    public static void main(String[] args) {

        int arr[] = { -1, -100, 3, 99 };
        int n = arr.length;
        int k = 2;
        int j = 0;
        int x;
        while (j <= k) {
            x = arr[0];
            for (int i = 1; i < n; i++) {
                if (i < n) {
                    arr[i - 1] = arr[i];
                }
            }
            arr[n - 1] = x;

            j++;

        }

        for (int val : arr) {
            System.out.print(val + " ");
        }

    }
}