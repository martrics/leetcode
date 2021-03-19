package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/3 18:20
 * version: 1.0.0
 */
public class Q796 {
    public static void main(String[] args) {

    }

    static class Solution{
        public boolean rotateString(String A, String B) {
            return A.length() == B.length() && (A + A).contains(B);
        }
    }
}
