package Month_1.Week_3.Day_3;

public class ConsecutiveOnes {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 1 };

        int n = arr.length;
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 0;
            }

        }
        System.out.println(maxCount);

    }
}
