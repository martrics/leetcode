package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/29 10:45
 * version: 1.0.0
 */
public class Interview1712 {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(5);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(3);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(0);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.right = node6;
        node4.left = node7;
        Solution solution = new Solution();
        TreeNode node = solution.convertBiNode(node1);
        while(node != null){
            System.out.print(node.val + "\t");
            node = node.right;
        }
    }

    static class Solution{
        public TreeNode convertBiNode(TreeNode root) {
            if(root == null){
                return null;
            }
            TreeNode head = root;
            if(root.left != null){
                head = convertBiNode(root.left);
                TreeNode node = head;
                while(node.right != null){
                    node = node.right;
                }
                node.right = root;
            }
            root.left = null;
            root.right = convertBiNode(root.right);

            return head;
        }

    }
}
