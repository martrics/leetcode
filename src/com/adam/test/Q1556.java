package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/7 13:40
 * version: 1.0.0
 */
public class Q1556 {
    public static void main(String[] args) {
        int n = 123456789;
        Solution solution = new Solution();
        System.out.println(solution.thousandSeparator(n));
    }

    static class Solution{
        public String thousandSeparator(int n) {
            String str = String.valueOf(n);
            int len = str.length();
            StringBuilder builder = new StringBuilder();
            int cycle = 0;
            for(int i = len - 1; i >= 0; i--){
                builder.append(str.charAt(i));
                cycle++;
                if(cycle == 3 && i != 0){
                    builder.append(".");
                    cycle = 0;
                }
            }
            return builder.reverse().toString();
        }
    }
}
