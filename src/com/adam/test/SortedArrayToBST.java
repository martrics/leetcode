package com.adam.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SortedArrayToBST {
    public static void main(String[] args) {
        int[] nums = new int[]{-10, -3, 0, 5, 9};
        Solution solution = new Solution();
        TreeNode treeNode = new TreeNode(1);
        TreeNode leftNode1 = new TreeNode(2);
        TreeNode rightNode1 = new TreeNode(3);
        treeNode.left = leftNode1;
        treeNode.right = rightNode1;
        TreeNode leftNode2 = new TreeNode(4);
        TreeNode rightNode2 = new TreeNode(5);
        leftNode1.left = leftNode2;
        leftNode1.right = rightNode2;
        List<String> result = new ArrayList<>();
        levelOrder(treeNode);
        //printTree(solution.sortedArrayToBST(nums));
    }

    static class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            return sortedArrayToBSTInternal(nums, 0, nums.length - 1);
        }

        private TreeNode sortedArrayToBSTInternal(int[] nums, int start, int end) {
            if (start > end) {
                return null;
            }
            if (start == end) {
                return new TreeNode(nums[start]);
            }
            int i = end - (end - start) / 2;
            TreeNode root = new TreeNode(nums[i]);
            TreeNode left = sortedArrayToBSTInternal(nums, start, i - 1);
            TreeNode right = sortedArrayToBSTInternal(nums, i + 1, end);
            root.left = left;
            root.right = right;
            return root;
        }
    }

    private static void levelOrder(TreeNode root) {
        List<String> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
            while (!queue.isEmpty()) {
                TreeNode treeNode = queue.poll();
                if (treeNode == null) {
                    list.add(null);
                } else {
                    list.add(String.valueOf(treeNode.val));
                    queue.add(treeNode.left);
                    queue.add(treeNode.right);
                }
            }
            for (String str : list) {
                System.out.print(str + "\t");
            }
            System.out.println();
        }
    }
}
