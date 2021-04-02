package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/1 17:36
 * version: 1.0.0
 */
public class Q572 {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(2);
        node1.left = node2;
        node2.right = node3;

        TreeNode node7 = new TreeNode(1);
        TreeNode node8 = new TreeNode(4);
        TreeNode node9 = new TreeNode(2);
        node7.right = node8;
        node8.left = node9;
        Solution solution = new Solution();
        System.out.println(solution.isSubtree(node1, node7));
    }

    static class Solution {
        public boolean isSubtree(TreeNode s, TreeNode t) {
            StringBuilder builder = new StringBuilder();
            inOrder(s, builder);
            String sStr = builder.toString();

            builder = new StringBuilder();
            inOrder(t, builder);
            String tStr = builder.toString();
            System.out.println(sStr);
            System.out.println(tStr);
            return sStr.contains(tStr);
        }

        private void inOrder(TreeNode root, StringBuilder builder){
            if(root == null){
                builder.append("$");
                return;
            }
            if(root.left == null && root.right == null){
                builder.append("#");
                builder.append(root.val);
                builder.append("@");
                return;
            }
            builder.append(root.val);
            inOrder(root.left, builder);
            inOrder(root.right, builder);
        }
    }
}
