package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/14 18:28
 * version: 1.0.0
 */
public class Q258 {
    public static void main(String[] args) {
        int num = 38;
        Solution solution = new Solution();
        System.out.println(solution.addDigits(num));
    }

    static class Solution{
        public int addDigits(int num) {
            if(num == 0){
                return 0;
            }
            int n = num % 9;
            return n == 0 ? 9 : n;
        }
    }
}
