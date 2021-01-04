package com.adam.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2020/12/30 10:03
 * version: 1.0.0
 */
public class Q590 {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(3);
        Node node3 = new Node(2);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        List<Node> list = new ArrayList<>();
        list.add(node2);
        list.add(node3);
        list.add(node4);
        node1.children = list;
        List<Node> list2 = new ArrayList<>();
        list2.add(node5);
        list2.add(node6);
        node2.children = list2;

        Solution solution = new Solution();
        List<Integer> result = solution.postorder(node1);
        for(Integer i : result){
            System.out.print(i + "\t");
        }
    }

    static class Solution{
        public List<Integer> postorder(Node root) {
            List<Integer> list = new ArrayList<>();
            if (root == null) {
                return list;
            }
            if (root.children == null) {
                list.add(root.val);
                return list;
            }
            Stack<Node> stack = new Stack<>();
            stack.push(root);
            while(!stack.isEmpty()){
                Node node = stack.peek();
                List<Node> children = node.children;
                if(children != null){
                    for(int i = children.size() - 1; i >= 0; i--){
                        stack.push(children.get(i));
                    }
                    node.children = null;
                }else{
                    list.add(stack.pop().val);
                }
            }
            return list;
        }
    }
}
