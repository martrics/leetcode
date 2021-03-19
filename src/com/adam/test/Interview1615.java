package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/12 16:04
 * version: 1.0.0
 */
public class Interview1615 {
    public static void main(String[] args) {
        String solution = "RGBY";
        String guess = "GGRR";
        Solution s = new Solution();
        int[] arr = s.masterMind(solution, guess);
        System.out.println(arr[0] + "\t" + arr[1]);
    }

    static class Solution {
        public int[] masterMind(String solution, String guess) {
            int[] sArr = new int[4];
            int[] gArr = new int[4];
            for(char c : solution.toCharArray()){
                sArr[getIndex(c)]++;
            }
            for(char c : guess.toCharArray()){
                gArr[getIndex(c)]++;
            }
            int hit = 0;
            int pseudoHit = 0;
            for(int i = 0; i < 4; i++){
                if(solution.charAt(i) == guess.charAt(i)){
                    hit++;
                    sArr[getIndex(solution.charAt(i))]--;
                    gArr[getIndex(solution.charAt(i))]--;
                }
            }
            for(int i = 0; i < 4; i++){
                pseudoHit += Math.min(sArr[i], gArr[i]);
            }
            return new int[]{hit, pseudoHit};
        }

        private int getIndex(char c){
            if(c == 'R'){
                return 0;
            }else if(c == 'G'){
                return 1;
            }else if(c == 'B'){
                return 2;
            }else{
                return 3;
            }
        }
    }
}
