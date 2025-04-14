package org.m3mpm;

public class Solution1 {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int index = s.lastIndexOf(' ') + 1;
        return s.length() - index;
    }
}
