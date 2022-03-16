package com.adam.test;

/**
 * @author: adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/12 23:13
 * version: 1.0.0
 */
public class Q606 {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        node1.left = node2;
        node1.right = node3;
        node2.right = node4;
        Solution solution = new Solution();
        System.out.println(solution.tree2str(node1));
    }

    static class Solution{
        public String tree2str(TreeNode t) {
            StringBuilder builder = new StringBuilder();
            if(t == null){
                return builder.toString();
            }
            preOrder(t, builder);
            return builder.toString();
        }

        private void preOrder(TreeNode node, StringBuilder builder){
            builder.append(node.val);
            if(node.left != null){
                builder.append("(");
                preOrder(node.left, builder);
                builder.append(")");
            }else if(node.right != null){
                builder.append("()");
            }
            if(node.right != null){
                builder.append("(");
                preOrder(node.right, builder);
                builder.append(")");
            }
        }
    }
}
