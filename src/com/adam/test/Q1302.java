package com.adam.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/27 14:19
 * version: 1.0.0
 */
public class Q1302 {
    public static void main(String[] args) {

    }

    static class Solution {
        public int deepestLeavesSum(TreeNode root) {
            if(root == null){
                return 0;
            }
            int ans = 0;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()){
                ans = 0;
                int count = queue.size();
                for(int i = 0; i < count; i++){
                    TreeNode node = queue.poll();
                    if(node.left != null){
                        queue.add(node.left);
                    }
                    if(node.right != null){
                        queue.add(node.right);
                    }
                    ans += node.val;
                }
            }
            return ans;
        }
    }
}
