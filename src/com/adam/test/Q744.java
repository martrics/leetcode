package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/6 18:28
 * version: 1.0.0
 */
public class Q744 {
    public static void main(String[] args) {
        char[] letters = new char[]{'c', 'f', 'j'};
        char target = 'k';
        Solution solution = new Solution();
        System.out.println(solution.nextGreatestLetter(letters, target));
    }

    static class Solution{
        public char nextGreatestLetter(char[] letters, char target) {
            int n = letters.length;
            if(target > letters[n - 1]){
                return letters[0];
            }
            for (char letter : letters) {
                if (letter > target) {
                    return letter;
                }
            }
            return letters[0];
        }
    }
}
