package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/8 14:33
 * version: 1.0.0
 */
public class Q563 {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(9);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(7);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.right = node6;
        Solution solution = new Solution();
        System.out.println(solution.findTilt(node1));
    }

    static class Solution{
        public int findTilt(TreeNode root) {
            if(root == null){
                return 0;
            }
            int result = 0;
            int leftSum = findSum(root.left);
            int rightSum = findSum(root.right);
            result += Math.abs(leftSum - rightSum);
            if(root.left != null){
                result += findTilt(root.left);
            }
            if(root.right != null){
                result += findTilt(root.right);
            }
            return result;
        }

        private int findSum(TreeNode node){
            if(node == null){
                return 0;
            }
            int sum = node.val;
            if(node.left != null){
                sum += findSum(node.left);
            }
            if(node.right != null){
                sum += findSum(node.right);
            }
            return sum;
        }
    }
}
