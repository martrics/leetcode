package com.adam.test;

import java.util.Arrays;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/5 16:05
 * version: 1.0.0
 */
public class IsUnique {
    public static void main(String[] args) {
        String s = "kzwunahkiz";
        Solution solution = new Solution();
        System.out.println(solution.isUnique(s));
    }

    static class Solution{
        public boolean isUnique(String astr) {
            if(astr == null || astr.length() < 2){
                return true;
            }
            char[] arr = astr.toCharArray();
            Arrays.sort(arr);
            for(int i = 1; i < astr.length(); i++){
                if(arr[i - 1] == arr[i]){
                    return false;
                }
            }
            return true;
        }
    }
}
