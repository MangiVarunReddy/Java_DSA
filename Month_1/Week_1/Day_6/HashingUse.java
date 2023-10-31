/*

                            Understanding the handing
                            
        Given an array of integers: [1, 2, 1, 3, 2] and we are given some 
        queries: [1, 3, 4, 2, 10]. For each query, we need to find out how 
        many times the number appears in the array. For example, if the query 
        is 1 our answer would be 2, and if the query is 4 the answer will be 0.                     

*/

//Brute Force Approach.

public class Main
{
	public static void main(String[] args) {
		int arr[]={1,2,1,3,2};
		int query[]={1,3,4,2,10};
		
		int arr1= arr.length;
		int arr2=query.length;
		
		int result[]=new int[arr2];
		int i=0;
		int count=0;
		for(int x:query){
		    for(int y:arr){
		        if(x==y){
		            count++;
		        }
		    }
		        result[i]=count;
		        i++;
		        count=0;
		        
		    
		}
		for(int num:result){
		    System.out.print(num+" ");
		}
		
	}
}

/*
Time Complexity analysis of the function:
We have learned how to compute the time complexity of any code. 
The above function contains a for loop that runs for N times. 
So, the time complexity of the function will be O(N) ignoring 
the other constant operations. 

Now, for each query, we are calling this function. So, if the 
query contains 5 numbers and we call the function 5 times, the 
total time complexity will be O(5*N). If the number of queries 
is Q, the time complexity will be O(Q*N). 

Now, if the length of the query becomes large like 105 and the 
array size also becomes large like 105, the time complexity will 
be O(1010).

We know from our previous knowledge that 108 operations take 1 second 
to get executed. So, 1010 operations will take around 100 seconds(1010/108). 
We cannot say a code is good if it takes 100 seconds to get executed.
*/

 
