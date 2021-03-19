package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/1 18:24
 * version: 1.0.0
 */
public class Q415 {
    public static void main(String[] args) {
        String num1 = "12345";
        String num2 = "56789";
        Solution solution = new Solution();
        System.out.println(solution.addStrings(num1, num2));
    }

    static class Solution {
        public String addStrings(String num1, String num2) {
            char[] A = num1.toCharArray();
            char[] B = num2.toCharArray();
            int lenA = A.length;
            int lenB = B.length;
            int len = Math.max(lenA, lenB);
            StringBuilder builder = new StringBuilder();
            int carry = 0;
            for(int i = 1; i <= len; i++){
                int valA = lenA - i >= 0? A[lenA -i] - '0' : 0;
                int valB = lenB - i >= 0? B[lenB - i] - '0' : 0;
                int val = valA + valB + carry;
                if(val > 9){
                    carry = 1;
                    val = val - 10;
                }else{
                    carry = 0;
                }
                builder.append(val);
            }
            if(carry > 0){
                builder.append(carry);
            }
            return builder.reverse().toString();
        }
    }
}
