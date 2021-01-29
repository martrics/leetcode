package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/21 11:27
 * version: 1.0.0
 */
public class Q235 {
    public static void main(String[] args) {

    }

    static class Solution{
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(root == null){
                return null;
            }
            if(p.val > q.val){
                TreeNode tmp = p;
                p = q;
                q = tmp;
            }
            return commonAncestor(root, p, q);
        }

        private TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q){
            if(q.val < root.val){
                return commonAncestor(root.left, p, q);
            }
            if(p.val > root.val){
                return commonAncestor(root.right, p, q);
            }
            return root;
        }
    }
}
