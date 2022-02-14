package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/9 17:36
 * version: 1.0.0
 */
public class Offer10II {
    public static void main(String[] args) {
        int n = 100;
        Solution solution = new Solution();
        System.out.println(solution.numWays(n));
    }

    static class Solution{
        public int numWays(int n) {
            if (n == 0) {
                return 1;
            }else if(n == 1){
                return 1;
            }
            int[] arr = new int[n];
            arr[0] = 1;
            arr[1] = 2;
            for (int i = 2; i < n; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
                arr[i] = arr[i] % 1000000007;
            }
            return arr[n - 1];
        }
    }
}
