//Problem 1: [12,35,1,10,34,1] => 2nd largest is 34
//Approach: Traverse the array and keep track of the largest and second largest elements.

public class P1_SecondLagest {
    public static void main(String[] args) {
        int[] arr = { 12, 35, 1, 10, 34, 1 };
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest element is: " + second);
        }
    }
}
// class Solution {
// public int getSecondLargest(int[] arr) {
// int n = arr.length;
// int first, second;
// if (n < 2) {
// return -1;
// }
// first = second = Integer.MIN_VALUE;
// for (int i = 0; i < n; i++) {
// if (arr[i] > first) {
// second = first;
// first = arr[i];
// } else if (arr[i] > second && arr[i] != first) {
// second = arr[i];
// }
// }
// if (second == Integer.MIN_VALUE)
// return -1;
// else
// return second;
// }
// }