package com.adam.test;

public class Q1299 {
    public static void main(String[] args) {
        int[] arr = new int[]{17, 18, 5, 4, 6, 1};
        Solution solution = new Solution();
        int[] result = solution.replaceElements(arr);
        for (int j : result) {
            System.out.print(j + "\t");
        }
    }

    static class Solution {
        public int[] replaceElements(int[] arr) {
            int max = -1;
            int n = arr.length;
            int[] result = new int[n];
            result[n - 1] = -1;
            for(int j = n - 2; j >= 0; j--){
                if(arr[j + 1] > max ){
                    max = arr[j + 1];
                }
                result[j] = max;
            }
            return result;
        }
    }
}
