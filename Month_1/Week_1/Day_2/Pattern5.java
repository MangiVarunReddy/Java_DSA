/*
*********
 *******
  *****
   ***
    *
 */

package Month_1.Week_1.Day_2;

public class Pattern5 {
    public static void main(String[] args) {
        
    
    int n=5;

    for(int i=0;i<=n;i++){
        for(int k=0;k<i;k++){
            System.out.print(" ");
        }
        for(int j=1;j<=(2*n)-(2*i+1);j++){
            System.out.print("*");
        }
        System.out.println();
        
    }
}
}
