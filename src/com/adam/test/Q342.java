package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/22 19:45
 * version: 1.0.0
 */
public class Q342 {
    public static void main(String[] args) {
        int n = 5;
        Solution solution = new Solution();
        System.out.println(solution.isPowerOfFour(n));
    }

    static class Solution{
        public boolean isPowerOfFour(int n) {
            if(n <= 0){
                return false;
            }
            while(n > 0){
                if(n == 1){
                    return true;
                }
                if((n & 0b11) != 0){
                    return false;
                }
                n = n >> 2;
            }
            return true;
        }
    }
}
