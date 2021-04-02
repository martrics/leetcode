package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/23 13:40
 * version: 1.0.0
 */
public class Q263 {
    public static void main(String[] args) {
        int n = 6;
        Solution solution = new Solution();
        System.out.println(solution.isUgly(n));
    }

    static class Solution{
        public boolean isUgly(int n) {
            if(n <= 0){
                return false;
            }
            if(n == 1){
                return true;
            }
            while((n & 0x1) == 0){
                n = n >> 1;
            }
            while(n % 5 == 0){
                n = n / 5;
            }
            while(n % 3 == 0){
                n = n / 3;
            }
            return n == 1;
        }
    }
}
