package com.adam.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/4 11:27
 * version: 1.0.0
 */
public class Q557 {
    public static void main(String[] args) {
        String s = "hello world";
        Solution solution = new Solution();
        System.out.println(solution.reverseWords(s));
    }

    static class Solution {
        public String reverseWords(String s) {
            if(s == null || s.equals("")){
                return s;
            }
            String[] list = s.split(" ");
            List<String> reversedList = new ArrayList<>();
            for(String str : list){
                reversedList.add(reverse(str));
            }
            return String.join(" ", reversedList);
        }

        private String reverse(String s){
            char[] arr = s.toCharArray();
            int n = arr.length;
            for(int i = 0; i < n / 2; i++){
                char tmp = arr[i];
                arr[i] = arr[n - 1 - i];
                arr[n - 1 - i] = tmp;
            }
            return String.valueOf(arr);
        }
    }
}
