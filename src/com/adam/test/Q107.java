package com.adam.test;

import java.util.*;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/15 11:22
 * version: 1.0.0
 */
public class Q107 {
    public static void main(String[] args) {

    }

    static class Solution{
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            List<List<Integer>> result = new ArrayList<>();
            if(root == null){
                return result;
            }
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()){
                List<Integer> list = new ArrayList<>();
                int count = queue.size();
                for(int i = 0; i < count; i++){
                    TreeNode node = queue.poll();
                    if(node.left != null){
                        queue.add(node.left);
                    }
                    if(node.right != null){
                        queue.add(node.right);
                    }
                    list.add(node.val);
                }
                result.add(list);
            }
            Collections.reverse(result);
            return result;
        }
    }
}
