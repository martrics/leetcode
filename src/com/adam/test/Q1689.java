package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/23 17:48
 * version: 1.0.0
 */
public class Q1689 {
    public static void main(String[] args) {

    }

    static class Solution{
        public int minPartitions(String n) {
            int ans = 0;
            for(char c : n.toCharArray()){
                ans = Math.max(ans, c - '0');
            }
            return ans;
        }
    }
}
