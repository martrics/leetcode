package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/22 11:37
 * version: 1.0.0
 */
public class Q859 {
    public static void main(String[] args) {
        String a = "ab";
        String b = "ba";
        Solution solution = new Solution();
        System.out.println(solution.buddyStrings(a, b));
    }

    static class Solution{
        public boolean buddyStrings(String a, String b) {
            int m = a.length();
            int n = b.length();
            if(m != n){
                return false;
            }
            if(m == 0 || m == 1){
                return false;
            }
            int count = 0;
            char diffA = 0;
            char diffB = 0;
            for(int i = 0; i < m; i++){
                if(a.charAt(i) != b.charAt(i)){
                    if(count == 0){
                        count++;
                        diffA = a.charAt(i);
                        diffB = b.charAt(i);
                    }else if(count == 1){
                        count++;
                        diffA -= b.charAt(i);
                        diffB -= a.charAt(i);
                    }else{
                        return false;
                    }
                }
            }
            if(count == 2){
                return diffA == 0 && diffB == 0;
            }
            if(count == 0){
                int[] arr = new int[26];
                for(char c : a.toCharArray()){
                    arr[c - 'a']++;
                    if(arr[c - 'a'] > 1){
                        return true;
                    }
                }
                return false;
            }else{
                return false;
            }
        }
    }
}
