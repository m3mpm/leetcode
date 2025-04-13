package org.m3mpm;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] nums = {1,3,5,6};
        int target = 7;
        Solution solution = new Solution();
        System.out.println(solution.searchInsert(nums, target));
    }
}