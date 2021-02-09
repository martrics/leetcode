package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/5 17:45
 * version: 1.0.0
 */
public class Interview1701 {
    public static void main(String[] args) {
        int a = 100;
        int b = -200;
        Solution solution = new Solution();
        System.out.println(solution.add(a, b));
    }

    static class Solution{
        public int add(int a, int b) {
            int sum = 0;
            int carry = 0;
            while(b != 0){
                sum = a ^ b;
                carry = (a & b) << 1;
                a = sum;
                b = carry;
            }
            return a;
        }
    }
}
