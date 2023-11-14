/* Leet Code Problem 1752
 Given an array nums, return true if the array was originally sorted 
 in non-decreasing order, then rotated some number of positions (including zero).
Otherwise, return false.

Example 1:

Input: nums = [3,4,5,1,2]
Output: true
Explanation: [1,2,3,4,5] is the original sorted array.
You can rotate the array by x = 3 positions to begin on the the element of value 3: [3,4,5,1,2].
 
This is how I have solved the problem using brute force. And I dont think this is the optimal
solution.
 */

package Month_1.Week_2.Day_6;

import java.util.*;

public class LeetCodeProblem1 {
    public static int[] removeDuplicates(int arr[], int n) {
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (al.contains(arr[i])) {
                continue;
            } else {
                al.add(arr[i]);
            }

        }
        int temp[] = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            temp[i] = al.get(i);
        }

        return temp;

    }

    public static int findMin(int arr[], int n) {
        int minVal = arr[0];
        int minIndex = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static boolean check(int arr[], int n) {
        boolean flag = true;
        int x = arr[0];
        for (int i = 1; i < n; i++) {

            if (arr[i] >= x) {
                x = arr[i];
            } else {
                flag = false;
                break;
            }

        }
        return flag;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 3, 4 };
        int len = arr.length;
        int[] list = removeDuplicates(arr, len);
        int n = list.length;
        int r = findMin(list, n);
        int x;
        boolean flag;

        if (r == 0) {
            System.out.println("the index is: " + r);
            flag = check(list, n);
        } else {

            while (r > 0) {
                x = list[0];
                for (int i = 0; i < n; i++) {
                    if (i != n - 1) {
                        list[i] = list[i + 1];

                    } else {
                        list[n - 1] = x;

                    }
                }
                r--;

            }

        }

        flag = check(list, n);
        for (int val : list) {
            System.out.print(val + " ");
        }
        System.out.println();
        if (flag == true) {
            System.out.println("The array is sorted");
        } else {
            System.out.println("The array is not sorted");
        }

    }
}

/*
 * LeetCode Problem Link:
 * https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
 * description/
 */
