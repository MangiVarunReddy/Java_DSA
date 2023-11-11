public class FindSecondSmallAndLargestElement {
    public static int findSecondSmall(int arr[],int n){
        int small=Integer.MAX_VALUE;
            int secondSmall=Integer.MAX_VALUE;
        if (n<2) {
            return -1;
        }
        else{

            for(int i=0;i<n;i++){
                if (arr[i]<small) {
                    secondSmall=small;
                    small=arr[i];
                }
                else if (arr[i]<secondSmall && secondSmall!=small) {
                    secondSmall=arr[i];
                }
            }
        }
        return secondSmall;
    }
    public static int findSecondLargest(int arr[],int n){
        int large=Integer.MIN_VALUE;
            int secondLarge=Integer.MIN_VALUE;
        if (n<2) {
            return -1;
        }
        else{

            

            for(int i=0;i<n;i++){
                if (arr[i]>large) {
                    secondLarge=large;
                    large=arr[i];
                }
                else if(arr[i]>secondLarge && secondLarge!=large){
                    secondLarge=arr[i];
                }
            }
        }
        return secondLarge;

    }
    public static void main(String[] args) {
        int arr[]={3,5,2,4,6};
		int n=5;
		// findSecondSmallest(arr,n);
       int secondLarge= findSecondLargest(arr,n);
       int secondSmall=findSecondSmall(arr,n);

       System.out.println("Second Smallest Element: "+secondSmall);
       System.out.println("Second Largest Element: "+secondLarge);
    }
    
}
