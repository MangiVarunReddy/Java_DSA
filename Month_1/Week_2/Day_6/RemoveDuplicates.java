package Month_1.Week_2.Day_6;

//Remove Duplicates

public class RemoveDuplicates {
    public static void main(String[] args) {

        int arr[] = { 1, 1, 2 };
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        System.out.println(i);
        for (int k = 0; k < i + 1; k++) {
            System.out.print(arr[k] + " ");

        }
    }
}
// LeetCode: https://leetcode.com/problems/remove-duplicates-from-sorted-array/

// CodingNinjas:
// https://www.codingninjas.com/studio/problems/remove-duplicates-from-sorted-array_1102307?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
