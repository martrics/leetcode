package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/27 18:50
 * version: 1.0.0
 */
public class Q190 {
    public static void main(String[] args) {

    }

    static class Solution{
        public int reverseBits(int n) {
            int ans = 0;
            int bit = n & 0x1;
            ans = ans | bit;
            for(int i = 1; i < 32; i++){
                n = n >> 1;
                bit = n & 0x1;
                ans = ans << 1;
                ans = ans | bit;
            }
            return ans;
        }
    }
}
