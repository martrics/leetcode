package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/29 16:31
 * version: 1.0.0
 */
public class Q836 {
    public static void main(String[] args) {
        int[] rec1 = new int[]{-1, 0, 1, 1};
        int[] rec2 = new int[]{0, -1, 0, 1};
        Solution solution = new Solution();
        System.out.println(solution.isRectangleOverlap(rec1, rec2));
    }

    static class Solution {
        public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
            if(rec1[0] == rec1[2] || rec1[1] == rec1[3]){
                return false;
            }
            if(rec2[0] == rec2[2] || rec2[1] == rec2[3]){
                return false;
            }
            return isCross(rec1[0], rec1[2], rec2[0], rec2[2]) &&
                    isCross(rec1[1], rec1[3], rec2[1], rec2[3]);
        }

        private boolean isCross(int x1, int x2, int x3, int x4) {
            if(x3 >= x2){
                return false;
            }
            return x4 > x1;
        }
    }
}
