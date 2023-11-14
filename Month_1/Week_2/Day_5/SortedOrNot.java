public class SortedOrNot {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 2 };
        int n = arr.length;

        int j = arr[0];
        boolean flag = true;
        for (int i = 1; i < n; i++) {
            if (arr[i] >= j) {
                j = arr[i];

            } else {
                flag = false;
                break;
            }
        }

        if (flag == true) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not Sorted");
        }
    }
}
