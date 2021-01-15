package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/15 15:03
 * version: 1.0.0
 */
public class Q669 {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(0);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(1);
        node1.left = node2;
        node1.right = node3;
        node2.right = node4;
        node4.left = node5;

        Solution solution = new Solution();
        TreeNode node = solution.trimBST(node1, 1, 3);
        System.out.println(node.val);
    }

    static class Solution{
        public TreeNode trimBST(TreeNode root, int low, int high) {
            if(root == null){
                return null;
            }
            if(root.val < low){
                return trimBST(root.right, low, high);
            }
            if(root.val > high){
                return trimBST(root.left, low, high);
            }
            root.left = trimBST(root.left, low, high);
            root.right = trimBST(root.right, low, high);
            return root;
        }
    }
}
