package com.adam.test;

public class XorOperation {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.xorOperation(5, 0));
    }

    static class Solution {
        public int xorOperation(int n, int start) {
            int result = start;
            for(int i = 1; i < n; i++){
                result = result ^ (start + 2 * i);
            }
            return result;
        }
    }
}
