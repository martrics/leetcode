package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/29 16:44
 * version: 1.0.0
 */
public class Q1317 {
    public static void main(String[] args) {

    }

    static class Solution{
        public int[] getNoZeroIntegers(int n) {
            for(int i = 1; i < n; i++){
                if(!String.valueOf(i).contains("0") && !String.valueOf(n - i).contains("0")){
                    return new int[]{i, n - i};
                }
            }
            return new int[]{1, n - 1};
        }
    }
}
