package com.adam.test;

public class HammingDistance {
    public static void main(String[] args) {
        int x = 1;
        int y = 4;
        Solution solution = new Solution();
        System.out.println(solution.hammingDistance(x, y));
    }

    static class Solution{
        public int hammingDistance(int x, int y) {
            int z = x ^ y;
            int count = 0;
            while(z != 0){
                z = z & (z - 1);
                count++;
            }
            return count;
        }
    }
}
