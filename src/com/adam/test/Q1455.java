package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/27 17:36
 * version: 1.0.0
 */
public class Q1455 {
    public static void main(String[] args) {
        String sentence = "i love eating burger";
        String searchWord = "burg";
        Solution solution = new Solution();
        System.out.println(solution.isPrefixOfWord(sentence, searchWord));
    }

    static class Solution{
        public int isPrefixOfWord(String sentence, String searchWord) {
            String[] arr = sentence.split(" ");
            for(int i = 0; i < arr.length; i++){
                if(arr[i].startsWith(searchWord)){
                    return ++i;
                }
            }
            return -1;
        }
    }
}
