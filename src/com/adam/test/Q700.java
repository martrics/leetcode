package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2020/12/31 10:32
 * version: 1.0.0
 */
public class Q700 {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(7);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(3);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        Solution solution = new Solution();
        TreeNode node = solution.searchBST(node1, 2);
        if(node == null){
            System.out.print("null");
        }else{
            System.out.print(node.val);
        }
    }

    static class Solution{
        public TreeNode searchBST(TreeNode root, int val) {
            if(root == null){
                return null;
            }else{
                if(root.val == val){
                    return root;
                }else if(root.val < val && root.right != null){
                    return searchBST(root.right, val);
                }else if(root.val > val && root.left != null){
                    return searchBST(root.left, val);
                }else{
                    return null;
                }
            }
        }
    }
}
