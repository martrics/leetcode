package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/13 11:52
 * version: 1.0.0
 */
public class Q1013 {
    public static void main(String[] args) {
        int[] arr = new int[]{3,3,6,5,-2,2,5,1,-9,4};
        Solution solution = new Solution();
        System.out.println(solution.canThreePartsEqualSum(arr));
    }

    static class Solution {
        public boolean canThreePartsEqualSum(int[] arr) {
            int sum = 0;
            int n = arr.length;
            for (int j : arr) {
                sum += j;
            }
            if (sum % 3 != 0) {
                return false;
            }
            sum = sum / 3;
            int count = 0;
            int partSum = 0;
            int i = 0;
            while (i < n) {
                partSum += arr[i++];
                if (partSum == sum) {
                    count++;
                    partSum = 0;
                }
                if (count == 2) {
                    break;
                }
            }
            return count == 2 && i != n;
        }
    }
}
