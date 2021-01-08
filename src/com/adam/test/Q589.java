package com.adam.test;

import java.util.*;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/4 10:47
 * version: 1.0.0
 */
public class Q589 {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(3);
        Node node3 = new Node(2);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        List<Node> list1 = new ArrayList<>();
        list1.add(node2);
        list1.add(node3);
        list1.add(node4);
        node1.children = list1;
        List<Node> list2 = new ArrayList<>();
        list2.add(node5);
        list2.add(node6);
        node2.children = list2;
        Solution solution = new Solution();
        List<Integer> list = solution.preorder(node1);
        for(Integer val : list){
            System.out.print(val + "\t");
        }
    }

    static class Solution{
        public List<Integer> preorder(Node root) {
            List<Integer> list = new ArrayList<>();
            Stack<Node> stack = new Stack<>();
            if(root == null){
                return list;
            }
            stack.add(root);
            while(!stack.isEmpty()){
                Node node = stack.pop();
                list.add(node.val);
                List<Node> children = node.children;
                if(children != null) {
                    for (int i = children.size() - 1; i >= 0; i--) {
                        stack.push(children.get(i));
                    }
                }
            }
            return list;
        }
    }
}
