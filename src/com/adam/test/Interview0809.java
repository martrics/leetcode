package com.adam.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/27 15:21
 * version: 1.0.0
 */
public class Interview0809 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> ans = solution.generateParenthesis(3);
        for (String str : ans) {
            System.out.println(str);
        }
    }

    static class Solution {
        private final List<String> list = new ArrayList<>();
        private int n;

        public List<String> generateParenthesis(int n) {
            if (n == 0) {
                return list;
            }
            this.n = n;
            genInternal(0, 0, "");
            return list;
        }

        private void genInternal(int left, int right, String str) {
            if (left == n && right == n) {
                list.add(str);
                return;
            }
            if (left < right) {
                return;
            }
            if (left == right) {
                String newStr = str + "(";
                genInternal(left + 1, right, newStr);
            } else {
                if (left < n) {
                    String newStr = str + "(";
                    genInternal(left + 1, right, newStr);
                }

                String newStr = str + ")";
                genInternal(left, right + 1, newStr);
            }
        }
    }
}
