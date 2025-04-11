package org.m3mpm;

public class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        } else if (haystack.length() < needle.length()) {
            return -1;
        } else {
            return haystack.indexOf(needle);
        }
    }
}
