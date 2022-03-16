package com.adam.test;

/**
 * @author: adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/31 16:18
 * version: 1.0.0
 */
public class Q839 {
    public static void main(String[] args) {
        String[] strs = new String[]{"blw","bwl","wlb"};
        Solution solution = new Solution();
        System.out.println(solution.numSimilarGroups(strs));
    }

    static class Solution{
        public int numSimilarGroups(String[] strs) {
            int n = strs.length;
            if(n < 2){
                return 0;
            }
            UnionFind unionFind = new UnionFind(n);
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(!unionFind.connected(i, j)){
                        String str1 = strs[i];
                        String str2 = strs[j];
                        if(str1.length() == str2.length()){
                            int k = 0;
                            int count = 0;
                            while(k < str1.length()){
                                if(str1.charAt(k) != str2.charAt(k)){
                                    count++;
                                }
                                k++;
                                if(count > 2){
                                    break;
                                }
                            }
                            if(count == 2 || count == 0){
                                unionFind.union(i, j);
                            }
                        }
                    }
                }
            }
            return unionFind.getCount();
        }
    }
}
