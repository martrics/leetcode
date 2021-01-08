package com.adam.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/8 14:29
 * version: 1.0.0
 */
public class Q500 {
    public static void main(String[] args) {
        String[] words = new String[]{"qz", "wq", "asdddafadsfa", "adfadfadfdassfawde"};
        Solution solution = new Solution();
        String[] result = solution.findWords(words);
        for (String str : result) {
            System.out.println(str);
        }
    }

    static class Solution {
        public String[] findWords(String[] words) {
            String s1 = "qwertyuiopQWERTYUIOP";
            String s2 = "asdfghjklASDFGHJKL";
            String s3 = "zxcvbnmZXCVBNM";
            List<String> list = new ArrayList<>();
            for (String str : words) {
                boolean bool1 = false;
                boolean bool2 = false;
                boolean bool3 = false;
                boolean bool = true;
                for (char c : str.toCharArray()) {
                    if (bool1 && bool2 || bool2 && bool3 || bool1 && bool3) {
                        bool = false;
                        break;
                    }
                    if (s1.indexOf(c) != -1) {
                        bool1 = true;
                    }
                    if (s2.indexOf(c) != -1) {
                        bool2 = true;
                    }
                    if (s3.indexOf(c) != -1) {
                        bool3 = true;
                    }
                }
                if (bool1 && bool2 || bool2 && bool3 || bool1 && bool3) {
                    bool = false;
                }
                if (bool) {
                    list.add(str);
                }
            }
            return list.toArray(new String[0]);
        }
    }
}
