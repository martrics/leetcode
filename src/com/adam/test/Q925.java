package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/19 11:13
 * version: 1.0.0
 */
public class Q925 {
    public static void main(String[] args) {
        String name = "kikcxmvzi";
        String typed = "kiikcxxmmvvzz";
        Solution solution = new Solution();
        System.out.println(solution.isLongPressedName(name, typed));
    }

    static class Solution {
        public boolean isLongPressedName(String name, String typed) {
            int m = name.length();
            int n = typed.length();
            if(m == 0){
                return false;
            }
            if(n < m){
                return false;
            }
            int i = 0;
            int j = 0;
            if(name.charAt(0) != typed.charAt(0)){
                return false;
            }
            while (i < m && j < n) {
                if(name.charAt(i) == typed.charAt(j)){
                    j++;
                    i++;
                }else{
                    while(j < n && typed.charAt(j) == typed.charAt(j - 1)){
                        j++;
                    }
                    if(j == n){
                        return false;
                    }
                    if(name.charAt(i) != typed.charAt(j)){
                        return false;
                    }
                }
            }
            while(j < n && typed.charAt(j) == typed.charAt(j - 1)){
                j++;
            }
            return j == n && i == m;
        }
    }
}
