package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/14 17:35
 * version: 1.0.0
 */
public class Q965 {
    public static void main(String[] args) {

    }

    static class Solution{
        public boolean isUnivalTree(TreeNode root) {
            if(root == null || (root.left == null && root.right == null)){
                return true;
            }
            boolean bool = true;
            if(root.left != null){
                bool = root.val == root.left.val && isUnivalTree(root.left);
            }
            if(root.right != null){
                bool = bool && root.val == root.right.val && isUnivalTree(root.right);
            }
            return bool;
        }
    }
}
