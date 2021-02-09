package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/8 17:20
 * version: 1.0.0
 */
public class Q1089 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 0, 0, 0, 0, 0, 0};
        Solution solution = new Solution();
        solution.duplicateZeros(arr);
        for(int val : arr){
            System.out.print(val + "\t");
        }
    }

    static class Solution {
        public void duplicateZeros(int[] arr) {
            int n = arr.length;
            int nCount = 0;
            int i = 0;
            for (; i < n; i++) {
                if (arr[i] == 0) {
                    nCount++;
                }
                nCount++;
                if (nCount >= n) {
                    break;
                }
            }
            int j = n - 1;
            if(nCount > n){
                j = n - 2;
                arr[n - 1] = arr[i];
                i = i - 1;
            }
            for (; i >= 0; i--) {
                if (arr[i] == 0) {
                    arr[j--] = 0;
                }
                arr[j--] = arr[i];
            }
        }
    }
}
