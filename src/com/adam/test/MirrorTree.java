package com.adam.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MirrorTree {
    public static void main(String[] args) {
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
        Solution solution = new Solution();
        TreeNode mirrorTree = solution.mirrorTree(treeNode);
        levelOrder(treeNode);
    }

    static class Solution{
        public TreeNode mirrorTree(TreeNode root) {
            if(root == null){
                return null;
            }else{
                TreeNode left = mirrorTree(root.left);
                TreeNode right = mirrorTree(root.right);
                root.left = right;
                root.right = left;
                return root;
            }
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
