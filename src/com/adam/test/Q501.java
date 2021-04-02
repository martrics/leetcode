package com.adam.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/22 18:23
 * version: 1.0.0
 */
public class Q501 {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(2);
        node1.right = node2;
        node2.left = node3;
        Solution solution = new Solution();
        int[] ans = solution.findMode(node1);
        for(int val : ans){
            System.out.println(val);
        }
    }

    static class Solution{
        List<Integer> answer = new ArrayList<>();
        int base, count, maxCount;

        public int[] findMode(TreeNode root) {
            dfs(root);
            int[] mode = new int[answer.size()];
            for (int i = 0; i < answer.size(); ++i) {
                mode[i] = answer.get(i);
            }
            return mode;
        }

        public void dfs(TreeNode o) {
            if (o == null) {
                return;
            }
            dfs(o.left);
            update(o.val);
            dfs(o.right);
        }

        public void update(int x) {
            if (x == base) {
                ++count;
            } else {
                count = 1;
                base = x;
            }
            if (count == maxCount) {
                answer.add(base);
            }
            if (count > maxCount) {
                maxCount = count;
                answer.clear();
                answer.add(base);
            }
        }
    }
}
