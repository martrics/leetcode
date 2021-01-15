package com.adam.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/14 17:30
 * version: 1.0.0
 */
public class Offer32II {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20);
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);
        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        node3.right = node5;
        Solution solution = new Solution();
        List<List<Integer>> list = solution.levelOrder(node1);
        for(List<Integer> li : list){
            for(int val : li){
                System.out.print(val + "\t");
            }
            System.out.print("\n");
        }
    }

    static class Solution{
        public List<List<Integer>> levelOrder(TreeNode root) {
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
            return result;
        }
    }
}
