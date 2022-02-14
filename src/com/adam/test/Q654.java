package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/27 17:21
 * version: 1.0.0
 */
public class Q654 {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 1, 6, 0, 5};
        Solution solution = new Solution();
        solution.constructMaximumBinaryTree(nums);
    }

    static class Solution {
        public TreeNode constructMaximumBinaryTree(int[] nums) {
            int n = nums.length;
            if(n == 0){
                return null;
            }
            return constuct(nums, 0, n);
        }

        private TreeNode constuct(int[] nums, int start, int end){
            if(start >= end){
                return null;
            }
            int index = findMax(start, end, nums);
            TreeNode node = new TreeNode(nums[index]);
            TreeNode left = constuct(nums, start, index);
            TreeNode right = constuct(nums, index + 1, end);
            node.left = left;
            node.right = right;
            return node;
        }

        private int findMax(int start, int end, int[] nums){
            int ans = start;
            for(int i = start; i < end; i++){
                if(nums[i] > nums[ans]){
                    ans = i;
                }
            }
            return ans;
        }
    }
}
