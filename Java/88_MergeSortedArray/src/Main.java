package org.m3mpm;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Solution solution = new Solution();

        System.out.println("**Example1**");
        int[] nums1 = {1,2,3,0,0,0};
        int m1 = 3;
        int[] nums2 = {2,5,6};
        int n1 = 3;
        solution.merge(nums1, m1, nums2, n1);
        System.out.println(Arrays.toString(nums1));

        System.out.println("**Example2**");
        int[] nums3 = {1,2,3,0,0,0,0};
        int m2 = 3;
        int[] nums4 = {2,3,5,6};
        int n2 = 4;
        solution.merge(nums3, m2, nums4, n2);
        System.out.println(Arrays.toString(nums3));

        System.out.println("**Example3**");
        int[] nums5 = {1};
        int m3 = 1;
        int[] nums6 = {};
        int n3 = 0;
        solution.merge(nums5, m3, nums6, n3);
        System.out.println(Arrays.toString(nums5));

        System.out.println("**Example4**");
        int[] nums7 = {0};
        int m4 = 0;
        int[] nums8 = {1};
        int n4 = 1;
        solution.merge(nums7, m4, nums8, n4);
        System.out.println(Arrays.toString(nums7));

        System.out.println("**Example5**");
        int[] nums9 = {1,0};
        int m5 = 1;
        int[] nums10 = {2};
        int n5 = 1;
        solution.merge(nums9, m5, nums10, n5);
        System.out.println(Arrays.toString(nums9));

        System.out.println("**Example6**");
        int[] nums11 = {2,0};
        int m6 = 1;
        int[] nums12 = {1};
        int n6 = 1;
        solution.merge(nums11, m6, nums12, n6);
        System.out.println(Arrays.toString(nums11));

        System.out.println("**Example7**");
        int[] nums13 = {-1,0,0,3,3,3,0,0,0};
        int m7 = 6;
        int[] nums14 = {1,2,2};
        int n7 = 3;
        solution.merge(nums13, m7, nums14, n7);
        System.out.println(Arrays.toString(nums13));

    }
}