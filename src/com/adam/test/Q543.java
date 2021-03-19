package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/1 9:44
 * version: 1.0.0
 */
public class Q543 {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(-7);
        TreeNode node3 = new TreeNode(-3);
        TreeNode node4 = new TreeNode(-9);
        TreeNode node5 = new TreeNode(-3);
        TreeNode node6 = new TreeNode(9);
        TreeNode node7 = new TreeNode(-7);
        TreeNode node8 = new TreeNode(-4);
        TreeNode node9 = new TreeNode(6);
        TreeNode node10 = new TreeNode(-6);
        TreeNode node11 = new TreeNode(-6);
        TreeNode node12 = new TreeNode(-0);
        TreeNode node13 = new TreeNode(6);
        TreeNode node14 = new TreeNode(5);
        TreeNode node15 = new TreeNode(9);
        TreeNode node16 = new TreeNode(-1);
        TreeNode node17 = new TreeNode(-4);
        TreeNode node18 = new TreeNode(-2);
        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        node3.right = node5;
        node4.left = node6;
        node4.right = node7;
        node5.left = node8;
        node6.left = node9;
        node7.left = node10;
        node7.right = node11;
        node9.left = node12;
        node9.right = node13;
        node10.left = node14;
        node11.left = node15;
        node13.left = node16;
        node13.right = node17;
        node15.right = node18;
        Solution solution = new Solution();
        System.out.println(solution.diameterOfBinaryTree(node1));
    }

    static class Solution {
        private int max = 0;

        public int diameterOfBinaryTree(TreeNode root) {
            if(root == null){
                return 0;
            }

            maxDepth(root);
            return max;
        }

        private int maxDepth(TreeNode root) {
            if(root == null){
                return 0;
            }else{
                int leftDepth = maxDepth(root.left);
                int rightDepth = maxDepth(root.right);
                max = Math.max(max, leftDepth + rightDepth);
                return 1 + (Math.max(leftDepth, rightDepth));
            }
        }
    }
}
