package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/25 17:59
 * version: 1.0.0
 */
public class Q551 {
    public static void main(String[] args) {

    }

    static class Solution{
        public boolean checkRecord(String s) {
            if(s == null){
                return true;
            }
            if(s.contains("LLL")){
                return false;
            }
            return s.indexOf('A') <= 0 || s.indexOf('A') == s.lastIndexOf('A');
        }
    }
}
