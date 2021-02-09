package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/8 15:32
 * version: 1.0.0
 */
public class Offer28 {
    public static void main(String[] args) {

    }

    static class Solution{
        public boolean isSymmetric(TreeNode root) {
            if(root == null){
                return true;
            }
            return isSymmetric(root.left, root.right);
        }

        private boolean isSymmetric(TreeNode left, TreeNode right){
            if(left == null && right == null){
                return true;
            }else if(left == null || right == null){
                return false;
            }else{
                return left.val == right.val && isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
            }
        }
    }
}
