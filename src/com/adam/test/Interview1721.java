package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/2 10:35
 * version: 1.0.0
 */
public class Interview1721 {
    public static void main(String[] args) {
        int[] height = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        Solution solution = new Solution();
        System.out.println(solution.trap(height));
    }

    static class Solution {
        public int trap(int[] height) {
            int left = 0;
            int right = height.length - 1;
            int leftMax = 0;
            int rightMax = 0;
            int ans = 0;
            while(left <= right){
                if(leftMax < rightMax){
                    ans += Math.max(0, leftMax - height[left]);
                    leftMax = Math.max(height[left], leftMax);
                    left++;
                }else{
                    ans += Math.max(0, rightMax - height[right]);
                    rightMax = Math.max(height[right], rightMax);
                    right--;
                }
            }
            return ans;
        }
    }
}
