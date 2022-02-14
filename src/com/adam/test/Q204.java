package com.adam.test;

import java.util.Arrays;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/20 11:20
 * version: 1.0.0
 */
public class Q204 {
    public static void main(String[] args) {

    }

    static class Solution{
        public int countPrimes(int n) {
            int[] arr = new int[5000001];
            Arrays.fill(arr, 1);
            arr[0] = 0;
            arr[1] = 0;
            int count = 0;
            for(int i = 2; i < n; i++){
                if(arr[i] == 1){
                    count++;
                    long val = (long) i * i;
                    if(val < n){
                        for(int j = (int)val; j < n; j += i){
                            arr[j] = 0;
                        }
                    }
                }
            }
            return count;
        }
    }
}
