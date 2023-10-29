public class OneToN {
    public static void printNum(int i,int n){
        if (i>n){
            return;
        } 
        else{
            System.out.println(i);
            printNum(i+1,n);
        }
    }
	public static void main(String[] args) {
		int n = 5;
		int i=1;
		
		printNum(i,n);
	}
}
