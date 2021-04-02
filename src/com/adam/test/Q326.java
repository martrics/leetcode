package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/23 20:04
 * version: 1.0.0
 */
public class Q326 {
    public static void main(String[] args) {

    }

    static class Solution{
        public boolean isPowerOfThree(int n) {
            if(n <= 0){
                return false;
            }
            while(n % 3 == 0){
                n = n / 3;
            }
            return n == 1;
        }
    }
}
