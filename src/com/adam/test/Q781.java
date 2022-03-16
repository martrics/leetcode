package com.adam.test;

import java.util.Arrays;

/**
 * @author: adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/4 11:43
 * version: 1.0.0
 */
public class Q781 {
    public static void main(String[] args) {
        int[] answers = new int[]{};
        Solution solution = new Solution();
        System.out.println(solution.numRabbits(answers));
    }

    static class Solution {
        public int numRabbits(int[] answers) {
            int n = answers.length;
            int ans = 0;
            Arrays.sort(answers);
            int cur = 0;
            int left = 0;
            for (int val : answers) {
                if(cur < val + 1){
                    ans += val + 1;
                    cur = val + 1;
                    left = val;
                }else{
                    if(left >= 1) {
                        left--;
                    }else{
                        ans += val + 1;
                        cur = val + 1;
                        left = val;
                    }
                }
            }
            return ans;
        }
    }
}
