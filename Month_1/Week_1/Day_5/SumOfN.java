public class SumOfN {
    public static int sumOfnNum(int n){
        int sum=0;
        if (n==0){
            return sum;
        } 
        else{
            
         return n + sumOfnNum(n-1);
          
        }
        
    }
	public static void main(String[] args) {
		int n = 5;
		
		
	int result=	sumOfnNum(n);
	System.out.println(result);
	}
}
