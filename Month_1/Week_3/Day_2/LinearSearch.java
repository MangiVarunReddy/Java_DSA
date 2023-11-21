package Month_1.Week_3.Day_2;

public class LinearSearch {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int x = 3;
        boolean flag = false;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                flag = true;
                index = i;
                break;
            }
        }
        if (flag == true) {
            System.out.println("The value is at index: " + index);
        } else {
            System.out.println("The value is not present");
        }
    }
}
