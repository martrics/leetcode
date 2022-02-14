package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/20 11:57
 * version: 1.0.0
 */
public class Q434 {
    public static void main(String[] args) {

    }

    static class Solution{
        public int countSegments(String s) {
            int n = s.length();
            if(n == 0){
                return 0;
            }
            s = s + " ";
            int count = 0;
            for(int i = 0; i < n; i++){
                if(s.charAt(i) != ' ' && s.charAt(i + 1) == ' '){
                    count++;
                }
            }
            return count;
        }
    }
}
