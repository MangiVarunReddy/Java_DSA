public class NtoOne {
    public static void printNum(int i,int n){
        if (i>n){
            return;
        } 
        else{
            System.out.println(n);
            printNum(i,n-1);
        }
    }
	public static void main(String[] args) {
		int n = 5;
		int i=1;
		
		printNum(i,n);
	}
}
