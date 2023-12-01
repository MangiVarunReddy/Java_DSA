// Find the number that appears once. This the Brute Force Approach

package Month_1.Week_3.Day_4;

public class FindSingleOccuranceElement {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 3, 3, 4, 4 };
        int n = arr.length;
        int count = 0;
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                result = arr[i];

            } else {
                count = 0;
            }
        }
        System.out.println(result);
    }
}
