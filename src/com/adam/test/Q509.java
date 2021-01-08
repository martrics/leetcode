package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/4 9:38
 * version: 1.0.0
 */
public class Q509 {
    public static void main(String[] args) {
        int n = 3;
        Solution solution = new Solution();
        System.out.println(solution.fib(n));
    }

    static class Solution {
        public int fib(int n) {
            if(n == 0 || n == 1){
                return n;
            }
            int[] arr = new int[n + 1];
            arr[0] = 0;
            arr[1] = 1;
            for(int i = 2; i < n + 1 ; i++){
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            return arr[n];
        }
    }
}
