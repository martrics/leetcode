package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/6 14:31
 * version: 1.0.0
 */
public class Q66 {
    public static void main(String[] args) {
        int[] digits = new int[]{0, 0, 9};
        Solution solution = new Solution();
        int[] ans = solution.plusOne(digits);
        for(int val : ans){
            System.out.print(val);
        }
    }

    static class Solution{
        public int[] plusOne(int[] digits) {
            int n = digits.length;
            StringBuilder builder = new StringBuilder();
            int carry = 1;
            for(int i = n - 1; i >= 0; i--){
                int val = digits[i] + carry;
                if(val > 9){
                    val = val - 10;
                    carry = 1;
                }else{
                    carry = 0;
                }
                builder.append(val);
            }
            if(carry != 0){
                builder.append(carry);
            }
            String str = builder.reverse().toString();
            int index = 0;
            while(str.charAt(index) == '0'){
                index++;
            }
            str = str.substring(index);
            n = str.length();
            int[] ans = new int[n];
            for(int i = n - 1; i >= 0; i--){
                ans[i] = str.charAt(i) - '0';
            }
            return ans;
        }
    }
}
