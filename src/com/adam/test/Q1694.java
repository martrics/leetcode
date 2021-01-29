package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/25 14:44
 * version: 1.0.0
 */
public class Q1694 {
    public static void main(String[] args) {
        String number = "12";
        Solution solution = new Solution();
        System.out.println(solution.reformatNumber(number));
    }

    static class Solution{
        public String reformatNumber(String number) {
            number = number.replaceAll(" ", "");
            number = number.replaceAll("-", "");
            int n = number.length();
            StringBuilder builder = new StringBuilder();
            int m = n / 3;
            int i = 0;
            for(; i < m - 1; i++){
                builder.append(number, i * 3, i * 3 + 3).append("-");
            }
            int left = m > 1? n - (m - 1) * 3 : n;
            if(left > 4){
                builder.append(number, i * 3, i * 3 + 3).append("-");
                i++;
                left -= 3;
            }
            if(left == 4){
                builder.append(number, i * 3, i * 3 + 2).append("-").append(number.substring(i * 3 + 2));
            }
            if(left < 4){
                builder.append(number, 3 * i, n);
            }
            return builder.toString();
        }
    }
}
