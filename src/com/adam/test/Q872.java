package com.adam.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/28 10:10
 * version: 1.0.0
 */
public class Q872 {
    public static void main(String[] args) {

    }

    static class Solution{
        public boolean leafSimilar(TreeNode root1, TreeNode root2) {
            List<Integer> leftList = new ArrayList<>();
            List<Integer> rightList = new ArrayList<>();
            leafList(root1, leftList);
            leafList(root2, rightList);
            if(leftList.size() != rightList.size()){
                return false;
            }
            for(int i = 0; i < leftList.size(); i++){
                if(!leftList.get(i).equals(rightList.get(i))){
                    return false;
                }
            }
            return true;
        }

        private void leafList(TreeNode root, List<Integer> list){
            if(root.left == null && root.right == null){
                list.add(root.val);
                return;
            }
            if(root.left != null){
                leafList(root.left, list);
            }
            if(root.right != null){
                leafList(root.right, list);
            }
        }
    }
}
