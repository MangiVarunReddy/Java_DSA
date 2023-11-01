
import java.util.HashMap;
import java.util.Scanner;
public class HashMapDemo
{
	public static void main(String[] args) {
		HashMap<Integer,Integer> map=new HashMap<>();
		
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter n value:");
		n=sc.nextInt();
		int[] arr= new int[n];
		
		for (int i=0;i<n ;i++ ){
		    System.out.println("Enter "+i+" value: ");
		    arr[i]=sc.nextInt();
		} 
		System.out.print( "n: ");
		for (int i=0;i<n ;i++ ){
		    System.out.print(arr[i]+" ");
		   
		}
		
		for(int i=0;i<n;i++){
		    int key=arr[i];
		    int freq=0;
		    if(map.containsKey(key))
		        freq=map.get(key);
		        freq++;
		  map.put(key,freq);
		        
		}

		
		System.out.println(map);
		
		int q;
		System.out.println("Enter q:");
		q=sc.nextInt();
		
		while(q-- >0){
		    int val;
		    System.out.println("Enter search value: ");
		    val=sc.nextInt();
		    if(map.containsKey(val)){
		   
		    System.out.println(map.get(val));
		        
		    }
		    else{
		        
		    System.out.println(0);
		    }
		}
		
		
	}
}
