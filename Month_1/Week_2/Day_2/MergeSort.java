/*
 Merge sort is a divide-and-conquer sorting algorithm. It recursively divides 
 an array into two halves, sorts each half, and then merges the sorted halves 
 to produce a fully sorted array. It has a time complexity of O(n log n), making 
 it an efficient sorting algorithm for large datasets.
 */

import java.util.*;

public class MergeSort {

public static void sort(int arr[],int l,int mid,int r){
    int i=l;
    int j=mid + 1;
    int k=l;
int[] temp = new int[r - l + 1];
    while(i<=mid && j<=r){
        if(arr[i]<=arr[j]){
            temp[k]=arr[i];
            k++;
            i++;
        }
        else{
            temp[k]=arr[j];
            k++;
            j++;
        }
    }
    while (i<=mid) {
        temp[k]=arr[i];
        i++;
        k++;
    }
    while (j<=r) {
        temp[k]=arr[j];
        j++;
        k++;
    }
    for(int p=l;p<=r;p++){
        arr[p]=temp[p];
    }

    System.out.println();
    System.out.println("Sorted Array is");

    for (int var : arr) {
        System.out.print(var+" ");
    }
}

    public static void mergeSort(int arr[],int l,int r){
        if (l<r) {
            int mid=(l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            sort(arr,l,mid,r);
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

        mergeSort(arr,0,n-1);
    }
}
