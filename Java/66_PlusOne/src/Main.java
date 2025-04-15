package org.m3mpm;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Solution solution = new Solution();


        System.out.println("**Example1**");
        int[] digits1 = {1,2,3};
        System.out.println(Arrays.toString(digits1));
        System.out.println(Arrays.toString(solution.plusOne(digits1)));

        System.out.println("**Example2**");
        int[] digits2 = {1,2,9};
        System.out.println(Arrays.toString(digits2));
        System.out.println(Arrays.toString(solution.plusOne(digits2)));

        System.out.println("**Example3**");
        int[] digits3 = {9,9,9};
        System.out.println(Arrays.toString(digits3));
        System.out.println(Arrays.toString(solution.plusOne(digits3)));

        System.out.println("**Example4**");
        int[] digits4 = {4,3,2,1};
        System.out.println(Arrays.toString(digits4));
        System.out.println(Arrays.toString(solution.plusOne(digits4)));

        System.out.println("**Example5**");
        int[] digits5 = {9};
        System.out.println(Arrays.toString(digits5));
        System.out.println(Arrays.toString(solution.plusOne(digits5)));

        System.out.println("**Example6**");
        int[] digits6 = {8};
        System.out.println(Arrays.toString(digits6));
        System.out.println(Arrays.toString(solution.plusOne(digits6)));

    }
}