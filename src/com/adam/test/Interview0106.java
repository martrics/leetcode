package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/31 17:35
 * version: 1.0.0
 */
public class Interview0106 {
    public static void main(String[] args) {
        String S = "a";
        Solution solution = new Solution();
        System.out.println(solution.compressString(S));
    }

    static class Solution{
        public String compressString(String S) {
            if(S.length() == 0){
                return S;
            }
            StringBuilder builder = new StringBuilder();
            char c = S.charAt(0);
            int count = 1;
            for(int i = 1; i < S.length(); i++){
                if(S.charAt(i) != c){
                    builder.append(c).append(count);
                    count = 1;
                    c = S.charAt(i);
                }else{
                    count++;
                }
            }
            builder.append(c).append(count);
            if(builder.length() >= S.length()){
                return S;
            }else{
                return builder.toString();
            }
        }
    }
}
