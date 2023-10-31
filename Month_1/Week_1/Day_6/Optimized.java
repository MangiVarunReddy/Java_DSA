

//Optimsed Approach with hashing technique.

/*
In this step, we will select each query i.e. the number and for the query, 
we will just fetch the value of hash[number] and return it instead of running 
a ‘for loop’ every time. 

*/

import java.util.Scanner;
public class Optimized
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int arr[]={1,2,1,3,2};
	
		int[] hash=new int[15];
		
		for(int i=0;i<arr.length;i++){
		    hash[arr[i]]++;
		}
		
		for(int i=0;i<hash.length;i++){
		    System.out.print(hash[i]+" ");
		}
		System.out.println();
		int q;
		q=sc.nextInt();
		while(q!=0){
		    System.out.println("Enter: ");
		    int num=sc.nextInt();
		    System.out.println(hash[num]);
		    q--;
		}
		
	}
}
/*

                            Limitation in this
                            
We may encounter a problem where the maximum array element may be very large like 109. 
In that case, theoretically, we should declare an array of size 10^9+1. But we cannot do so. 
he maximum size of an array can be the following:

Inside main, Array declaration max size is 10^6
but in globally it is 10^7

Note: So, with this method, we can solve the problems where the array is within a specific size. 
We are going to discuss later in the article, how we can overcome this limitation of the specific size.

Until now, we have learned the number hashing. Now, let’s discuss the character hashing.                    

*/