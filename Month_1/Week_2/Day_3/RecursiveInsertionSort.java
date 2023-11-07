
public class RecursiveInsertionSort
{
    public static void insertionSort(int arr[],int i,int n){
        
        if(i==n){
            return;
        }
        else{
            int j=i;
            while(j>0 && arr[j]<arr[j - 1]){
                
                    int temp=arr[j];
                    arr[j]=arr[j - 1];
                    arr[j - 1 ]=temp;
                    j--;
                
        }
        
     insertionSort(arr,i+1,n);
    }
    }
    
	public static void main(String[] args) {
		int arr[]={4,3,0,2,1};
		int n=arr.length;
	insertionSort(arr,0,n);
	for(int x:arr){
	    System.out.print(x+" ");
	}
	}
}

