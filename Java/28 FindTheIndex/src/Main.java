package org.m3mpm;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Solution solution = new Solution();
        String haystack = "leetcode";
        String needle = "leeto";

        System.out.println(solution.strStr(haystack, needle));
    }
}