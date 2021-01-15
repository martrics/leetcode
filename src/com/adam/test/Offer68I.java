package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/14 12:09
 * version: 1.0.0
 */
public class Offer68I {
    public static void main(String[] args) {

    }

    static class Solution{
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(p.val < root.val && q.val < root.val){
                return lowestCommonAncestor(root.left, p, q);
            }else if(p.val > root.val && q.val > root.val){
                return lowestCommonAncestor(root.right, p, q);
            }else{
                return root;
            }
        }
    }
}
