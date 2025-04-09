package org.m3mpm;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Solution1 solution1 = new Solution1();
        Solution2 solution2 = new Solution2();
        int[] array = {0,0,1,1,1,2,2,3,3,4};
        System.out.println("Original array");
        System.out.println("Array length: " + array.length);
        System.out.println(Arrays.toString(array));
        System.out.println("Solution1");
        System.out.println("Array length: " + solution1.removeDuplicates(array));
        System.out.println(Arrays.toString(array));
        System.out.println("Solution2");
        System.out.println("Array length: " + solution2.removeDuplicates(array));
        System.out.println(Arrays.toString(array));

    }
}