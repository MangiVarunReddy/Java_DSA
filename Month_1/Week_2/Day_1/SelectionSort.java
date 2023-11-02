import java.util.*;

public class SelectionSort {

public static void selectionSort(int[] arr){

    int n=arr.length;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if (arr[i]>arr[j]) {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    System.out.println("The Sorted Array is: ");
    for (int var : arr) {
        System.out.print(var+" ");
    }
}

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
        System.out.println("The array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        selectionSort(arr);
    }
}
