/*
 In each iteration of the insertion sort algorithm, the algorithm works by taking 
 an element from the unsorted part of the array and inserting it into its correct 
 position within the sorted part of the array. As the algorithm progresses, it 
 effectively builds the sorted part of the array from the beginning to the end. 
 This means that the smallest element is placed at the beginning of the sorted 
 part of the array after each iteration, gradually expanding the sorted portion 
 of the array.
 */

 /*
Approach: 

1) Select an element in each iteration from the unsorted array(using a loop).
2) Place it in its corresponding position in the sorted part and shift the remaining elements accordingly (using an inner loop and swapping).
3) The “inner while loop” basically shifts the elements using swapping.
  */

import java.util.*;
public class InsertionSort {

public static void insertionSort(int arr[],int n){

    for(int i=0;i<n;i++){
        int j=i;
        while (j>0) {
            if (arr[j]<arr[j-1]) {
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
            j--;
        }
    }
    System.out.println();
    System.out.println("Sorted Array:");
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

        insertionSort(arr,n);
}
}

//Problem Link
//https://www.codingninjas.com/studio/problems/insertion-sort_624381?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
