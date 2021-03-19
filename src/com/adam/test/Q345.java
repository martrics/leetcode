package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/3 18:22
 * version: 1.0.0
 */
public class Q345 {
    public static void main(String[] args) {
        String s = "aA";
        Solution solution = new Solution();
        System.out.println(solution.reverseVowels(s));
    }

    static class Solution {
        public String reverseVowels(String s) {
            if(s.length() < 2){
                return s;
            }
            int i = 0;
            int j = s.length() - 1;
            String vowels = "aeiouAEIOU";
            char[] arr = s.toCharArray();
            while(i < j){
                while(i < j && vowels.indexOf(arr[i]) < 0){
                    i++;
                }
                while(i < j && vowels.indexOf(arr[j]) < 0){
                    j--;
                }
                if(i < j){
                    char c = arr[i];
                    arr[i] = arr[j];
                    arr[j] = c;
                    i++;
                    j--;
                }
            }
            return new String(arr);
        }
    }
}
