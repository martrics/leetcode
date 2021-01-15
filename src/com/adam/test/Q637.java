package com.adam.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/14 14:34
 * version: 1.0.0
 */
public class Q637 {
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
        List<Double> list = solution.averageOfLevels(node1);
        for(Double val : list){
            System.out.println(val);
        }
    }

    static class Solution{
        public List<Double> averageOfLevels(TreeNode root) {
            List<Double> result = new ArrayList<>();
            if(root == null){
                return result;
            }
            double total = 0.0;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()){
                total = 0.0;
                int count = queue.size();
                for(int i = 0; i < count; i++){
                    TreeNode node = queue.poll();
                    if(node.left != null){
                        queue.add(node.left);
                    }
                    if(node.right != null){
                        queue.add(node.right);
                    }
                    total += node.val;
                }
                result.add(total / count);
            }
            return result;
        }
    }
}
