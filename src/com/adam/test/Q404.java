package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/9 14:41
 * version: 1.0.0
 */
public class Q404 {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20);
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);
        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        node3.right = node5;
        Solution solution = new Solution();
        System.out.println(solution.sumOfLeftLeaves(node1));
    }

    static class Solution{
        private int sum;
        public int sumOfLeftLeaves(TreeNode root) {
            sum = 0;
            sumOfLeaves(root);
            return sum;
        }

        private void sumOfLeaves(TreeNode root){
            if(root == null){
                return;
            }
            if(root.left != null){
                if( root.left.left == null && root.left.right == null){
                    sum += root.left.val;
                }else{
                    sum += sumOfLeftLeaves(root.left);
                }
            }
            if(root.right != null){
                sum += sumOfLeftLeaves(root.right);
            }
        }
    }
}
