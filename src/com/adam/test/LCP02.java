package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/15 16:21
 * version: 1.0.0
 */
public class LCP02 {
    public static void main(String[] args) {
        int[] cont = new int[]{3, 2, 0, 2};
        Solution solution = new Solution();
        int[] result = solution.fraction(cont);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

    static class Solution{
        public int[] fraction(int[] cont) {
            int n = cont.length;
            if(n == 1){
                return new int[]{cont[0], 1};
            }
            int x = cont[n - 1];
            int y = 1;
            for(int i = n - 2; i >= 0; i--){
                int tmp = y;
                y = x;
                x = tmp + cont[i] * x;
            }
            return new int[]{x, y};
        }
    }
}
