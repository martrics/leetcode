package com.adam.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/12 13:46
 * version: 1.0.0
 */
public class Offer68II {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(6);
        TreeNode node5 = new TreeNode(2);
        TreeNode node6 = new TreeNode(0);
        TreeNode node7 = new TreeNode(8);
        TreeNode node8 = new TreeNode(7);
        TreeNode node9 = new TreeNode(4);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        node5.left = node8;
        node5.right = node9;

        Solution solution = new Solution();
        TreeNode lca = solution.lowestCommonAncestor(node1, node2, node8);
        System.out.println(lca.val);
    }

    static class Solution{
        private boolean findP = false;
        private boolean findQ = false;
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            Map<TreeNode, TreeNode> map = new HashMap<>();
            map.put(root, root);
            findAncestor(root, map, p, q);
            Set<TreeNode> set = new HashSet<>();
            set.add(p);
            while(true){
                TreeNode ancestor = map.get(p);
                set.add(ancestor);
                p = ancestor;
                if(ancestor == root){
                    break;
                }
            }
            while(true){
                if(!set.contains(q)){
                    q = map.get(q);
                }else{
                    return q;
                }
            }
        }

        private void findAncestor(TreeNode root, Map<TreeNode, TreeNode> map, TreeNode p, TreeNode q){
            if(findP && findQ){
                return;
            }
            if(root.left != null){
                map.put(root.left, root);
                findAncestor(root.left, map, p, q);
            }
            if(root.right != null){
                map.put(root.right, root);
                findAncestor(root.right, map, p, q);
            }
            if(root.left == p || root.right == p){
                findP = true;
            }
            if(root.left == q || root.right == q){
                findQ = true;
            }
        }
    }
}
