package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/1 9:18
 * version: 1.0.0
 */
public class Q1006 {
    public static void main(String[] args) {

    }

    static class Solution {
        public int clumsy(int N) {
            if(N <= 4){
                if(N == 1){
                    return 1;
                }
                if(N == 2){
                    return 2;
                }
                if(N == 3){
                    return 6;
                }
                if(N == 4){
                    return 7;
                }
            }else{
                int k = N % 4;
                if(k == 0){
                    return N + 1;
                }else if(k == 1){
                    return N + 2;
                }else if (k == 2){
                    return N + 2;
                }else {
                    return N - 1;
                }
            }
            return 0;
        }
    }
}
