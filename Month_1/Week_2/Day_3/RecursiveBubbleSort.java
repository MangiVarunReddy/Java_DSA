public class RecursiveBubbleSort
{
    public static void bubbleSort(int arr[],int n){
        
        if(n==1){
            return;
        }
        else{
            for(int j=0;j<=n-2;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    
                }
                
        }
        
     bubbleSort(arr,n-1);
    }
    }
    
	public static void main(String[] args) {
		int arr[]={4,3,5,2,1};
		int n=arr.length;
	bubbleSort(arr,n);
	for(int x:arr){
	    System.out.print(x+" ");
	}
	}
}
