package com.adam.test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/25 18:04
 * version: 1.0.0
 */
public class Q993 {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node3.right = node5;
        Solution solution = new Solution();
        System.out.println(solution.isCousins(node1, 2, 3));
    }

    static class Solution{
        public boolean isCousins(TreeNode root, int x, int y) {
            if(root == null || root.val == x || root.val == y){
                return false;
            }
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            boolean findX = false;
            boolean findY = false;
            while(queue.size() != 0){
                int len = queue.size();
                for(int i = 0; i < len; i++){
                    TreeNode node = queue.poll();
                    if(node.left != null && node.right != null && (node.left.val == x && node.right.val == y || node.left.val == y && node.right.val == x)){
                        return false;
                    }
                    if(node.left != null){
                        queue.add(node.left);
                        if(node.left.val == x){
                            findX = true;
                        }
                        if(node.left.val == y){
                            findY = true;
                        }
                    }
                    if(node.right != null){
                        queue.add(node.right);
                        if(node.right.val == x){
                            findX = true;
                        }
                        if(node.right.val == y){
                            findY = true;
                        }
                    }
                    if(findX && findY){
                        return true;
                    }
                }
                if(findX && !findY || findY && !findX){
                    return false;
                }
                findX = false;
                findY = false;
            }
            return false;
        }
    }
}
