package com.adam.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MergeTrees {
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(2);
        TreeNode treeNode4 = new TreeNode(5);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;

        TreeNode treeNode5 = new TreeNode(2);
        TreeNode treeNode6 = new TreeNode(1);
        TreeNode treeNode7 = new TreeNode(3);
        TreeNode treeNode8 = new TreeNode(4);
        TreeNode treeNode9 = new TreeNode(7);
        treeNode5.left = treeNode6;
        treeNode5.right = treeNode7;
        treeNode6.right = treeNode8;
        treeNode7.right = treeNode9;

        Solution solution = new Solution();
        TreeNode result = solution.mergeTrees(treeNode1, treeNode5);
        levelOrder(result);
    }

    static class Solution{
        public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
            if(t1 == null){
                return t2;
            }
            if(t2 == null){
                return t1;
            }
            TreeNode treeNode = new TreeNode(t1.val + t2.val);
            treeNode.left = mergeTrees(t1.left, t2.left);
            treeNode.right = mergeTrees(t1.right, t2.right);
            return treeNode;
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
