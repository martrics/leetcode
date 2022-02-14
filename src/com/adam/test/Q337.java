package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/16 16:07
 * version: 1.0.0
 */
public class Q337 {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(5);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(3);
        TreeNode node6 = new TreeNode(1);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.right = node6;
        Solution solution = new Solution();
        System.out.println(solution.rob(node1));
    }

    static class Solution{
        public int rob(TreeNode root) {
            if(root == null){
                return 0;
            }
            int[] ans = robInternal(root);
            return Math.max(ans[0], ans[1]);
        }

        private int[] robInternal(TreeNode root){
            if(root == null){
                return new int[]{0, 0};
            }
            int[] left = robInternal(root.left);
            int[] right = robInternal(root.right);
            int[] ans = new int[2];
            ans[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
            ans[1] = root.val + left[0] + right[0];
            return ans;
        }
    }
}
