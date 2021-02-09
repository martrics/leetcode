package com.adam.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/8 16:00
 * version: 1.0.0
 */
public class Q653 {
    public static void main(String[] args) {

    }

    static class Solution{
        public boolean findTarget(TreeNode root, int k) {
            List<Integer> list = new ArrayList<>();
            inOrder(root, list);
            int i = 0;
            int j = list.size() - 1;
            while(i < j){
                if(list.get(i) + list.get(j) == k){
                    return true;
                }else if(list.get(i) + list.get(j) < k){
                    i++;
                }else{
                    j--;
                }
            }
            return false;
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
