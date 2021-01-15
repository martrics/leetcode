package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/14 14:48
 * version: 1.0.0
 */
public class Q171 {
    public static void main(String[] args) {
        String s = "ZY";
        Solution solution = new Solution();
        System.out.println(solution.titleToNumber(s));
    }

    static class Solution{
        public int titleToNumber(String s) {
            int result = 0;
            char[] arr = s.toCharArray();
            int len = arr.length;
            int pow = 1;
            for(int i = len - 1; i >= 0; i--){
                result += pow * (arr[i] - 'A' + 1);
                pow = pow * 26;
            }
            return result;
        }
    }
}
