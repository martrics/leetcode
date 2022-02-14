package com.adam.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/25 15:53
 * version: 1.0.0
 */
public class Q535 {
    public static void main(String[] args) {

    }

    static class Codec {
        private Map<String, String> map = new HashMap<>();
        private static final String INDEX = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        private static final String TINYURL_PREFIX = "http://tinyurl.com/";

        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            char[] chs = new char[6];
            for (int i = 0; i < 6; i++) {
                chs[i] = INDEX.charAt((int) (Math.random() * 62));
            }
            String shortUrl = TINYURL_PREFIX + new String(chs);
            if (!map.containsKey(shortUrl)) {
                map.put(shortUrl, longUrl);
                return shortUrl;
            } else {
                return longUrl;
            }
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            return map.getOrDefault(shortUrl, shortUrl);
        }
    }
}
