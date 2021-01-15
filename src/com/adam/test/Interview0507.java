package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/11 15:33
 * version: 1.0.0
 */
public class Interview0507 {
    public static void main(String[] args) {
        int num = 2;
        Solution solution = new Solution();
        System.out.println(solution.exchangeBits(num));
    }

    static class Solution{
        public int exchangeBits(int num) {
            return ((num & 0x55555555) << 1) | ((num & 0xAAAAAAAA) >> 1);
        }
    }
}
