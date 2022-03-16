package com.adam.test;

/**
 * @author: adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/13 17:14
 * version: 1.0.0
 */
public class Interview0109 {
    public static void main(String[] args) {

    }

    static class Solution{
        public boolean isFlipedString(String s1, String s2) {
            if(s1.length() != s2.length()){
                return false;
            }
            return (s1 + s2).contains(s1);
        }
    }
}
