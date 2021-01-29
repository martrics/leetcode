package com.adam.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/29 14:52
 * version: 1.0.0
 */
public class Q1078 {
    public static void main(String[] args) {
        String text = "we will we will rock you";
        String first = "we";
        String second = "will";
        Solution solution = new Solution();
        String[] ans = solution.findOcurrences(text, first, second);
        for(String str : ans){
            System.out.print(str + "\t");
        }
    }

    static class Solution {
        public String[] findOcurrences(String text, String first, String second) {
            List<String> list = new ArrayList<>();
            String[] arr = text.split(" ");
            int n = arr.length;
            if (n < 3) {
                return list.toArray(new String[0]);
            }
            for (int i = 0; i < n - 2; i++) {
                if (arr[i].equals(first) && arr[i + 1].equals(second)) {
                    list.add(arr[i + 2]);
                    i++;
                }
            }
            return list.toArray(new String[0]);
        }
    }
}
