package com.adam.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/9 14:54
 * version: 1.0.0
 */
public class Q783 {
    public static void main(String[] args) {

    }

    static class Solution{
        public int minDiffInBST(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            inOrder(root, list);
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < list.size() - 1; i++){
                min = Math.min(min, list.get(i + 1) - list.get(i));
            }
            return min;
        }

        private void inOrder(TreeNode root, List<Integer> list){
            if(root == null){
                return;
            }
            inOrder(root.left, list);
            list.add(root.val);
            inOrder(root.right, list);
        }
    }
}
