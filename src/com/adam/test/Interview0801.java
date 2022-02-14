package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/20 15:31
 * version: 1.0.0
 */
public class Interview0801 {
    public static void main(String[] args) {
        int n = 5;
        Solution solution = new Solution();
        System.out.println(solution.waysToStep(n));
    }

    static class Solution{
        public int waysToStep(int n) {
            if(n == 1 || n == 2){
                return n;
            }
            int[] arr = new int[n + 1];
            arr[0] = 1;
            arr[1] = 1;
            arr[2] = 2;
            for(int i = 3; i <= n; i++) {
                arr[i] += arr[i - 3];
                arr[i] = arr[i] % 1000000007;
                arr[i] += arr[i - 2];
                arr[i] = arr[i] % 1000000007;
                arr[i] += arr[i - 1];
                arr[i] = arr[i] % 1000000007;
            }
            return arr[n];
        }
    }
}
