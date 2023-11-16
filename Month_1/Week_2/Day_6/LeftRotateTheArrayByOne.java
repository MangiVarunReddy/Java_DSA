package Month_1.Week_2.Day_6;

public class LeftRotateTheArrayByOne {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int i = arr[0];

        for (int j = 0; j < n; j++) {
            if (j < n - 1) {

                arr[j] = arr[j + 1];
            }
        }

        arr[n - 1] = i;
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");

        }
    }
}
