/*
Optimized Bubble Sort is a variation of the Bubble Sort algorithm that adds an 
early exit condition. It checks if any swaps were made during a pass and breaks 
the loop early if no swaps occurred, indicating that the array is already sorted. 
This optimization reduces unnecessary comparisons and improves the algorithm's 
efficiency, especially for partially sorted arrays. However, it still has a 
worst-case time complexity of O(n^2), making it inefficient for large datasets. 
More advanced sorting algorithms are preferred for larger data sets.

 */
import java.util.*;
public class OptimizedBubbleSort {

public static void optimizedBubbleSort(int arr[], int n){

    boolean swapped;
    for(int i=0;i<n;i++){
        swapped=false;
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swapped=true;
            }
        }
        if (!swapped) {
            break;
        }
    }
    System.out.println("The sorted array is: ");
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
        optimizedBubbleSort(arr,n);
    }
}

