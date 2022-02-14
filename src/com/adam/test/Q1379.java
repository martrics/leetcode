package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/26 11:40
 * version: 1.0.0
 */
public class Q1379 {
    public static void main(String[] args) {

    }

    static class Solution {
        public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
            if(original == target){
                return cloned;
            }
            return find(original, cloned, target);
        }

        private TreeNode find(TreeNode original, TreeNode cloned, TreeNode target){
            if(original == null){
                return null;
            }
            if(original == target){
                return cloned;
            }
            TreeNode left = find(original.left, cloned.left, target);
            if(left != null){
                return left;
            }
            return find(original.right, cloned.right, target);
        }
    }
}
