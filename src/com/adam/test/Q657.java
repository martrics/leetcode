package com.adam.test;

public class Q657 {
    public static void main(String[] args) {
        String moves = "UD";
        Solution solution = new Solution();
        System.out.println(solution.judgeCircle(moves));
    }

    static class Solution{
        public boolean judgeCircle(String moves) {
            int uCount = 0;
            int dCount = 0;
            int lCount = 0;
            int rCount = 0;
            for(int i = 0; i < moves.length(); i++){
                if(moves.charAt(i) == 'U'){
                    uCount++;
                }else if(moves.charAt(i) == 'D'){
                    dCount++;
                }else if(moves.charAt(i) == 'L'){
                    lCount++;
                }else if(moves.charAt(i) == 'R'){
                    rCount++;
                }
            }
            return uCount == dCount && lCount == rCount;
        }
    }
}
