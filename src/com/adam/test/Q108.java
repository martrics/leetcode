package com.adam.test;

import java.util.*;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2020/12/31 13:47
 * version: 1.0.0
 */
public class Q108 {
    public static void main(String[] args) {
        int[] nums = new int[]{-10, -3, 0, 5, 9};
        Solution solution = new Solution();
        TreeNode node = solution.sortedArrayToBST(nums);
        levelOrder(node);
    }

    static class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            if(nums.length == 0){
                return null;
            }
            if(nums.length == 1){
                return new TreeNode(nums[0]);
            }
            int mid = nums.length / 2;
            TreeNode node = new TreeNode(nums[mid]);
            node.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, mid));
            node.right = sortedArrayToBST(Arrays.copyOfRange(nums, mid + 1, nums.length));
            return node;
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
