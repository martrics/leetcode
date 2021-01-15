package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/14 18:46
 * version: 1.0.0
 */
public class Q1022 {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(0);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(0);
        TreeNode node5 = new TreeNode(1);
        TreeNode node6 = new TreeNode(0);
        TreeNode node7 = new TreeNode(1);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        Solution solution = new Solution();
        System.out.println(solution.sumRootToLeaf(node1));
    }

    static class Solution{
        public int sumRootToLeaf(TreeNode root) {
            int sum = 0;
            if(root == null){
                return 0;
            }
            if(root.left == null && root.right == null){
                return root.val;
            }
            if(root.left != null){
                root.left.val += 2 * root.val;
                sum += sumRootToLeaf(root.left);
            }
            if(root.right != null){
                root.right.val += 2 * root.val;
                sum += sumRootToLeaf(root.right);
            }
            return sum;
        }
    }
}
