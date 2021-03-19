package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/24 9:05
 * version: 1.0.0
 */
public class Q492 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int area = 37;
        int[] ans = solution.constructRectangle(area);
        System.out.print(ans[0] + "\t" + ans[1]);
    }

    static class Solution{
        public int[] constructRectangle(int area) {
            int l = area;
            int w = 1;
            int[] ans = new int[]{l, w};
            while(l >= w){
                if(area % l == 0){
                    w = area / l;
                    if(l >= w) {
                        ans[0] = l;
                        ans[1] = w;
                    }
                }
                l--;
            }
            return ans;
        }
    }
}
