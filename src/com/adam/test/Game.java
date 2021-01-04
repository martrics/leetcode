package com.adam.test;

public class Game {
    public static void main(String[] args){
        int[] guess = new int[]{1, 2, 3};
        int[] answer = new int[]{1, 2, 3};

        Solution solution = new Solution();
        System.out.println(solution.game(guess, answer));
    }

    static class Solution {
        public int game(int[] guess, int[] answer) {
            return (guess[0] == answer[0] ? 1 : 0) +
                    (guess[1] == answer[1] ? 1 : 0) +
                    (guess[2] == answer[2] ? 1 : 0);
        }
    }
}
