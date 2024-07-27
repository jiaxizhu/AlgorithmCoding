package org.example.leetcode;

import java.util.HashSet;

public class LongestSubString {

    public int lengthOfLongestSubstring(String s) {
        int [] res = new int[128];

        int i = 0;
        int result = 0;
        for (int j = 0; j < s.length(); j++) {
            i = Math.max(i, res[s.charAt(j)]);
            result = Math.max(result, j - i + 1);
            res[s.charAt(j)] = j + 1;
        }
        return result;
    }
}
