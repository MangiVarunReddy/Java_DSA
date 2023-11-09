public class FindSmallestInArray {
    public static void findSmallest(int arr[],int n){
        int val=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>val){
                val=arr[i];
            }
        }
        System.out.println("The Largest Element in the Array is: "+val);
    }
    public static void main(String[] args) {
        int arr[]={3,5,2,4,6};
		int n=5;
		findSmallest(arr,n);
    }
}
