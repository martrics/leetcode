package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/8 10:43
 * version: 1.0.0
 */
public class Interview1611 {
    public static void main(String[] args) {
        int shorter = 1;
        int longer = 2;
        int k = 3;
        Solution solution = new Solution();
        int[] ans = solution.divingBoard(shorter, longer, k);
        for(int val : ans){
            System.out.print(val + "\t");
        }
    }

    static class Solution{
        public int[] divingBoard(int shorter, int longer, int k) {
            if(k == 0){
                return new int[0];
            }

            if(shorter == longer){
                return new int[]{k * shorter};
            }

            int[] ans = new int[k + 1];
            int index = 0;
            for(int i = 0; i <= k; i++){
                ans[index++] = i * longer + (k - i) * shorter;
            }

            return ans;
        }
    }
}
