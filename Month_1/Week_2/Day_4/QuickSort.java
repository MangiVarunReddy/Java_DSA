import java.util.*;
public class QuickSort
{
    public static void swap(int arr[],int a, int b){
        int temp=arr[a];
                arr[a]=arr[b];
                arr[b]=temp;
                
    }
    public static int partition(int arr[],int low, int high){
        int pivot=arr[high];
        int pIndex=low;
        for(int i=low;i<high;i++){
            if(arr[i]<pivot){
                swap(arr,i,pIndex);
                pIndex++;
            }
        }
       swap(arr,pIndex, high);
       return pIndex;
        
    }
    public static void quickSort(int[] arr, int low,int high){
        if(low<high){
            int p=partition(arr,low,high);
            quickSort(arr,low,p-1);
            quickSort(arr,p+1,high);
        }
    }
	public static void main(String[] args) {
		int arr[]={3,5,2,4,6};
		int n=5;
		quickSort(arr,0,n-1);
		
		for(int x:arr){
		    System.out.print(x+" ");
		}
	}
}
