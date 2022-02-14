package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/2 17:39
 * version: 1.0.0
 */
public class Q671 {
    public static void main(String[] args) {

    }

    static class Solution{
        public int findSecondMinimumValue(TreeNode root) {
            return min(root, root.val);
        }

        private int min(TreeNode node, int val){
            if(node == null || (node.left == null && node.right == null)){
                return -1;
            }
            if(node.val > val){
                return node.val;
            }
            int leftMin = min(node.left, val);
            int rightMin = min(node.right, val);
            if(leftMin > val && rightMin > val){
                return Math.min(leftMin, rightMin);
            }
            return Math.max(leftMin, rightMin);
        }
    }
}
