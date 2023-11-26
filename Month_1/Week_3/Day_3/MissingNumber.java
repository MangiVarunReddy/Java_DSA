package Month_1.Week_3.Day_3;

public class MissingNumber {
    public static void main(String[] args) {

        int n = 5;
        int arr[] = { 1, 3, 4, 5 };
        int siz = arr.length;
        int sum = 0;
        int sumOfSequence = n * (n + 1) / 2;
        for (int i = 0; i < siz; i++) {

            sum = sum + arr[i];

        }
        System.out.println(sumOfSequence - sum);
    }
}
