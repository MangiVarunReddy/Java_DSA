//Optimal Approach
// Assume the given array is: [4,1,2,1,2]
// XOR of all elements = 4^1^2^1^2
//       = 4 ^ (1^1) ^ (2^2)
//       = 4 ^ 0 ^ 0 = 4^0 = 4
//Hence, 4 is the single element in the array.

package Month_1.Week_3.Day_4;

public class OptimalApproachSingleAppearence {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 1, 3, 3, 4, 4 };
        int n = arr.length;
        int result = 0;
        for (int i = 0; i < n; i++) {
            result = result ^ arr[i];
        }
        System.out.println(result);
    }
}