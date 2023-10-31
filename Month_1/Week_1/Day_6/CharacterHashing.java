/*
*Character Hashing:
Given the string: “abcdabefc” we are given some queries: [a, c, z]. 
For each query, we need to find out how many times the character appears 
in the string. For example, if the query is ‘a’ our answer would be 2, and 
if the query is ‘z’ the answer will be 0. 
*/

import java.util.Scanner;
public class CharacterHashing
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		
		String s;
		System.out.println("Enter String: ");
		s=sc.next();
		
		int[]hash=new int[256];
		
		for (int i=0;i<s.length(); i++ ) {
		    hash[s.charAt(i)]++;
		}
		
		int n;
        System.out.println("Enter no of charcters you want to check: ");
        n=sc.nextInt();
        while (n-- >0) {
            char c;
            System.out.println("Enter character: ");
            c=sc.next().charAt(0);


            System.out.println(hash[c]);
        }
		
	}
}

/*
Optimized approach using Hashing:
In number hashing, each index of the hash array represents an element 
in the given array. So, somehow, we need to map the characters of the 
string to an integer so that we can represent them using the indices 
of the hash array. So, let’s discuss the mapping technique:

Mapping characters to integers:
In order to map the characters we need to use the ASCII values of the 
respective characters. The ASCII value of lowercase a is 97. So, if we 
write int x = ‘a’, it will typecast the character, ‘a’, into the ASCII 
value, 97, and store it in the variable x instead of throwing an error. 
So, similarly, if we write hash[‘a’], it will signify hash[97]. 
 */

 /*
  If the string contains both uppercase and lowercase letters: We have 
  256 characters in total in this case. So, we will create a hash array 
  of size 256. We will not subtract anything from the given character 
  and will use the character as it is, to access the hash array while 
  pre-storing and fetching. For pre-storing hash[s[i]] += 1 and for 
  fetching we will use hash[character] only. The rest of the process 
  will be exactly the same as in the number hashing.
  */
