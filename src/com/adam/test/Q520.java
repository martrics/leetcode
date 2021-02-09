package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/9 16:58
 * version: 1.0.0
 */
public class Q520 {
    public static void main(String[] args) {
        String word = "Flag";
        Solution solution = new Solution();
        System.out.println(solution.detectCapitalUse(word));
    }

    static class Solution{
        public boolean detectCapitalUse(String word) {
            int n = word.length();
            boolean flag = word.charAt(0) >= 'A' && word.charAt(0) <= 'Z';
            int upperCount = 0;
            int lowerCount = 0;
            for(int i = 1; i < n; i++){
                if(!flag){
                    if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                        return false;
                    }
                }else {
                    if(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z'){
                        upperCount++;
                    }else{
                        lowerCount++;
                    }
                    if(lowerCount > 0 && upperCount > 0){
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
