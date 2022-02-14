package com.adam.test;
/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/21 11:50
 * version: 1.0.0
 */
public class Q7 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverse(-2147483648));
    }

    static class Solution{
        public int reverse(int x) {
            if(x == 0 || x == Integer.MIN_VALUE){
                return 0;
            }
            int sign = x > 0? 1 : -1;
            x = Math.abs(x);
            int val = x;
            StringBuilder builder = new StringBuilder();
            while(val > 0){
                builder.append(val % 10);
                val = val / 10;
            }
            String reversed = builder.toString();
            String str = String.valueOf(Integer.MIN_VALUE);
            if(reversed.length() != str.length() - 1){
                return Integer.parseInt(reversed) * sign;
            }else{
                for(int i = 0; i < reversed.length(); i++){
                    if(reversed.charAt(i) > str.charAt(i + 1)){
                        return 0;
                    }
                    if(reversed.charAt(i) < str.charAt(i + 1)){
                        return Integer.parseInt(reversed) * sign;
                    }
                }
                return 0;
            }
        }
    }
}
