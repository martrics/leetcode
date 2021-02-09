package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/8 15:14
 * version: 1.0.0
 */
public class Offer55II {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node4.left = node5;
        Solution solution = new Solution();
        System.out.println(solution.depth(node1));
    }

    static class Solution{
        public boolean isBalanced(TreeNode root) {
            if(root == null){
                return true;
            }
            if(Math.abs(depth(root.left) - depth(root.right)) > 1){
                return false;
            }else{
                return isBalanced(root.left) && isBalanced(root.right);
            }
        }

        public int depth(TreeNode node){
            if(node == null){
                return 0;
            }
            return Math.max(depth(node.left) + 1, depth(node.right) + 1);
        }
    }
}
