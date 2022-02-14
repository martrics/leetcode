package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/19 9:44
 * version: 1.0.0
 */
public class Q168 {
    public static void main(String[] args) {
        int columnNumber = 701;
        Solution solution = new Solution();
        System.out.println(solution.convertToTitle(columnNumber));
    }

    static class Solution{
        public String convertToTitle(int columnNumber) {
            StringBuilder builder = new StringBuilder();
            if(columnNumber == 1){
                return "A";
            }
            while(columnNumber > 0){
                columnNumber--;
                builder.append((char)(columnNumber % 26 + 'A'));
                columnNumber = columnNumber / 26;
            }
            return builder.reverse().toString();
        }
    }
}
