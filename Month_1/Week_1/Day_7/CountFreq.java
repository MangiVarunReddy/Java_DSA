
import java.util.Scanner;

public class CountFreq {
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int val;
            System.out.print("Enter " + i + ": ");
            val = sc.nextInt();
            arr[i] = val;
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int[] freq = new int[13];

        for (int i = 0; i < n; i++) {
            int element = arr[i];
            int count = 0;
            if (freq[element] == 0) {
                for (int j = 0; j < n; j++) {
                    if (arr[j] == element) {
                        count++;
                    }
                }
                freq[element] = count;
            }
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " " + freq[i]);
            }
        }
    }
}
