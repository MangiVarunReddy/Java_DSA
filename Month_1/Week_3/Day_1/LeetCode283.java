package Month_1.Week_3.Day_1;

class LeetCode283 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 3, 4, 0, 0, 5, 6 };
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
