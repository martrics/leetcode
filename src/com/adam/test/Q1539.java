package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/23 16:14
 * version: 1.0.0
 */
public class Q1539 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 4, 7, 11};
        int k = 5;
        Solution solution = new Solution();
        System.out.println(solution.findKthPositive(arr, k));
    }

    static class Solution {
        public int findKthPositive(int[] arr, int k) {
            int n = arr.length;
            int[] lost = new int[n];
            lost[0] = arr[0] - 1;
            for (int i = 1; i < n; i++) {
                lost[i] = arr[i] - arr[i - 1] - 1;
            }
            for (int i = 0; i < n; i++) {
                if (k > lost[i]) {
                    k -= lost[i];
                } else {
                    if(i == 0){
                        return k;
                    }else {
                        return arr[i - 1] + k;
                    }
                }
            }
            return arr[n - 1] + k;
        }
    }
}
