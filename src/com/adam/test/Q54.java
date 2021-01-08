package com.adam.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/4 9:56
 * version: 1.0.0
 */
public class Q54 {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(6);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(1);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node4.left = node6;
        Solution solution = new Solution();
        System.out.print(solution.kthLargest(node1, 3));
    }

    static class Solution{
        public int kthLargest(TreeNode root, int k) {
            List<Integer> list = new ArrayList<>();
            if(root == null){
                return 0;
            }
            internal(root, list, k);
            return list.get(k - 1);
        }

        private void internal(TreeNode root, List<Integer> list, int k){
            if(root == null){
                return;
            }
            if(list.size() >= k){
                return;
            }
            internal(root.right, list, k);
            list.add(root.val);
            internal(root.left, list, k);
        }
    }
}
