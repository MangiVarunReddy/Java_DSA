/*
 Bubble sort is a simple sorting algorithm that repeatedly compares adjacent 
 elements and swaps them if they are in the wrong order. It has a worst-case 
 time complexity of O(n^2) and is not efficient for large lists. Optimized 
 bubble sort adds a flag to stop early when the list is already sorted, reducing 
 unnecessary comparisons. Despite these optimizations, it is still inefficient 
 compared to more advanced sorting algorithms and is rarely used in practice for 
 large datasets.

 */
import java.util.*;
public class BubbleSort {

public static void bubbleSort(int arr[], int n){

    for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
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
        bubbleSort(arr,n);
    }
}
