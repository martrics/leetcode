package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/2 16:57
 * version: 1.0.0
 */
public class Q100 {
    public static void main(String[] args) {

    }

    static class Solution{
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if(p == null && q != null){
                return false;
            }
            if(p != null && q == null){
                return false;
            }
            if(p == null && q == null){
                return true;
            }
            return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }
}
