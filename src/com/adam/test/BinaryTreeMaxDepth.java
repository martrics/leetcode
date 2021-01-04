package com.adam.test;

public class BinaryTreeMaxDepth {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode leftNode1 = new TreeNode(2);
        TreeNode rightNode1 = new TreeNode(3);
        treeNode.left = leftNode1;
        treeNode.right = rightNode1;
        TreeNode leftNode2 = new TreeNode(4);
        TreeNode rightNode2 = new TreeNode(5);
        leftNode1.left = leftNode2;
        leftNode1.right = rightNode2;
        Solution solution = new Solution();
        System.out.println(solution.maxDepth(treeNode));
    }

    static class Solution{
        public int maxDepth(TreeNode root) {
            if(root == null){
                return 0;
            }else{
                int leftDepth = maxDepth(root.left);
                int rightDepth = maxDepth(root.right);
                return 1 + (Math.max(leftDepth, rightDepth));
            }
        }
    }
}
