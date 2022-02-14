package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/21 16:48
 * version: 1.0.0
 */
public class Offer10I {
    public static void main(String[] args) {

    }

    static class Solution{
        public int fib(int n) {
            if(n == 0 || n == 1){
                return n;
            }
            int[] arr = new int[n + 1];
            arr[0] = 0;
            arr[1] = 1;
            for(int i = 2; i <= n; i++){
                arr[i] += arr[i - 1];
                arr[i] = arr[i] % 1000000007;
                arr[i] += arr[i - 2];
                arr[i] = arr[i] % 1000000007;
            }
            return arr[n];
        }
    }
}
