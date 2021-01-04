package com.adam.test;

public class NumJewelsInStones {
    public static void main(String[] args){
        String J = "aA";
        String S = "aAAbbbb";

        Solution solution = new Solution();
        System.out.println(solution.numJewelsInStones(J, S));
    }

    static class Solution{
        public int numJewelsInStones(String J, String S) {
            int result = 0;
            for(int j = 0; j < S.length(); j++){
                if(J.indexOf(S.charAt(j)) != -1){
                    result++;
                }
            }
            return result;
        }
    }
}
