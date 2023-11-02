
import java.util.*;


public class HighestAndLowestFreq {

    public static void findFrequency(int arr[]){

        int size=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
    
        int freq=0;
        for(int i=0;i<size;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
    
        System.out.println(map);


        int minFreq=Integer.MAX_VALUE;
        int maxFreq=0;
        int minVal=0;
        int maxVal=0;

        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            int count= entry.getValue();
            int element=entry.getKey();
            if (count>maxFreq) {
                maxFreq=count;
                maxVal=element;
            }
            if (count<minFreq) {
                minFreq=count;
                minVal=element;
            }

        }

        System.out.println("Max Entry is: ");
        System.out.println("Key     value");
        System.out.println(maxFreq+"      "+maxVal);

        System.out.println("Mix Entry is: ");
        System.out.println("Key     value");
        System.out.println(minFreq+"      "+minVal);
    
    
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int val;
            System.out.print("Enter " + i + ": ");
            val = sc.nextInt();
            arr[i] = val;
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
System.out.println();
findFrequency(arr);

    }
}
