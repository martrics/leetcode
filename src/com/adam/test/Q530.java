package com.adam.test;

import java.net.Socket;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/1 11:05
 * version: 1.0.0
 */
public class Q530 {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(12);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(18);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(9);
        TreeNode node6 = new TreeNode(15);
        TreeNode node7 = new TreeNode(19);
        TreeNode node8 = new TreeNode(17);
        TreeNode node9 = new TreeNode(16);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        node6.right = node8;
        node8.left = node9;
        Solution solution = new Solution();
        System.out.println(solution.getMinimumDifference(node1));
    }

    static class Solution {
        public int getMinimumDifference(TreeNode root) {
            int min = getMinimum(root);
            if(root.left != null) {
                min = Math.min(min, getMinimumDifference(root.left));
            }
            if(root.right != null){
                min = Math.min(min, getMinimumDifference(root.right));
            }
            return min;
        }

        private int getMinimum(TreeNode root){
            int min = Integer.MAX_VALUE;
            TreeNode node = root.left;
            if(node != null) {
                while (node.right != null) {
                    node = node.right;
                }
                min = Math.min(root.val - node.val, min);
            }

            node = root.right;
            if(node != null) {
                while (node.left != null) {
                    node = node.left;
                }
                min = Math.min(node.val - root.val, min);
            }
            return min;
        }
    }
}
