package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/22 9:49
 * version: 1.0.0
 */
public class Q67 {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        Solution solution = new Solution();
        System.out.println(solution.addBinary(a, b));
    }

    static class Solution{
        public String addBinary(String a, String b) {
            char[] A = a.toCharArray();
            char[] B = b.toCharArray();
            int lenA = A.length;
            int lenB = B.length;
            int len = Math.max(lenA, lenB);
            StringBuilder builder = new StringBuilder();
            int carry = 0;
            for(int i = 1; i <= len; i++){
                int valA = lenA - i >= 0? A[lenA -i] - '0' : 0;
                int valB = lenB - i >= 0? B[lenB - i] - '0' : 0;
                int val = valA + valB + carry;
                if(val > 1){
                    carry = 1;
                    val = val - 2;
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
