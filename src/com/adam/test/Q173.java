package com.adam.test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author: adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/28 9:16
 * version: 1.0.0
 */
public class Q173 {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(7);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(9);
        TreeNode node5 = new TreeNode(20);
        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        node3.right = node5;
        BSTIterator bstIterator = new BSTIterator(node1);
        System.out.println(bstIterator.next());
        System.out.println(bstIterator.next());
        System.out.println(bstIterator.hasNext());
        System.out.println(bstIterator.next());
        System.out.println(bstIterator.hasNext());
        System.out.println(bstIterator.next());
        System.out.println(bstIterator.hasNext());
        System.out.println(bstIterator.next());
        System.out.println(bstIterator.hasNext());
    }

    static class BSTIterator {
        private final Stack<TreeNode> stack = new Stack<>();

        public BSTIterator(TreeNode root) {
            addLeft(root);
        }

        public int next() {
            TreeNode node = stack.peek();
            stack.pop();
            if(node.right != null){
                addLeft(node.right);
            }
            return node.val;
        }

        public boolean hasNext() {
            return !stack.isEmpty();
        }

        private void addLeft(TreeNode node){
            while(node != null){
                stack.push(node);
                node = node.left;
            }
        }
    }
}
