package com.adam.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/5 10:43
 * version: 1.0.0
 */
public class Q897 {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(6);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(8);
        TreeNode node7 = new TreeNode(1);
        TreeNode node8 = new TreeNode(7);
        TreeNode node9 = new TreeNode(9);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.right = node6;
        node4.left = node7;
        node6.left = node8;
        node6.right = node9;
        Solution solution = new Solution();
        TreeNode node = solution.increasingBST(node1);
        while (node != null) {
            System.out.print(node.val + "\t");
            node = node.right;
        }
    }

    static class Solution {
        public TreeNode increasingBST(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            travelInternal(root, list);

            TreeNode dummyHead = new TreeNode(-1);
            TreeNode node = dummyHead;
            for (int val : list) {
                node.right = new TreeNode(val);
                node = node.right;
            }
            return dummyHead.right;
        }

        private void travelInternal(TreeNode root, List<Integer> list) {
            if (root != null) {
                if (root.left != null) {
                    travelInternal(root.left, list);
                }
                list.add(root.val);
                if (root.right != null) {
                    travelInternal(root.right, list);
                }
            }
        }
    }
}
