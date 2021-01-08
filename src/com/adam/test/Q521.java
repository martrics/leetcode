package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/8 13:44
 * version: 1.0.0
 */
public class Q521 {
    public static void main(String[] args) {

    }

    static class Solution{
        public int findLUSlength(String a, String b) {
            if(a.equals(b)){
                return -1;
            }
            return Math.max(a.length(), b.length());
        }
    }
}
