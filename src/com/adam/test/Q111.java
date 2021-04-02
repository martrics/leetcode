package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/2 16:10
 * version: 1.0.0
 */
public class Q111 {
    public static void main(String[] args) {

    }

    static class Solution{
        public int minDepth(TreeNode root) {
            if(root == null){
                return 0;
            }
            int leftDepth = minDepth(root.left);
            int rightDepth = minDepth(root.right);
            if(leftDepth == 0 || rightDepth == 0){
                return 1 + leftDepth + rightDepth;
            }else {
                return 1 + (Math.min(leftDepth, rightDepth));
            }
        }
    }
}
