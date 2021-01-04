package com.adam.test;

public class Q938 {
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(10);
        TreeNode treeNode2 = new TreeNode(5);
        TreeNode treeNode3 = new TreeNode(15);
        TreeNode treeNode4 = new TreeNode(3);
        TreeNode treeNode5 = new TreeNode(7);
        TreeNode treeNode6 = new TreeNode(13);
        TreeNode treeNode7 = new TreeNode(18);
        TreeNode treeNode8 = new TreeNode(1);
        TreeNode treeNode9 = new TreeNode(6);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;
        treeNode4.left = treeNode8;
        treeNode5.left = treeNode9;

        Solution solution = new Solution();
        int low = 6;
        int high = 10;
        System.out.println(solution.rangeSumBST(treeNode1, low, high));
    }

    static class Solution{
        public int rangeSumBST(TreeNode root, int low, int high) {
            if(root == null){
                return 0;
            }
            if(root.val < low){
                return rangeSumBST(root.right, low, high);
            }else if(root.val > high){
                return rangeSumBST(root.left, low, high);
            }else{
                return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
            }
        }
    }
}
