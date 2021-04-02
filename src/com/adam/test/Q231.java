package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/23 20:01
 * version: 1.0.0
 */
public class Q231 {
    public static void main(String[] args) {

    }

    static class Solution {
        public boolean isPowerOfTwo(int n) {
            return n > 0 && Integer.bitCount(n) == 1;
        }
    }
}
