package com.adam.test;

import java.util.Arrays;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/15 15:17
 * version: 1.0.0
 */
public class Q961 {
    public static void main(String[] args) {

    }

    static class Solution{
        public int repeatedNTimes(int[] A) {
            Arrays.sort(A);
            int n = A.length;
            if(A[0] == A[1]){
                return A[0];
            }
            if(A[n - 2] == A[n - 1]){
                return A[n - 1];
            }
            return A[n >> 1];
        }
    }
}
