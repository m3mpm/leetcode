package org.m3mpm;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Solution solution = new Solution();

        System.out.println("Example 1");
        int[] array = {4, 4, 3, 4, 5, 4, 7, 8, 9, 10};
        int val = 4;
        System.out.println("length = " + solution.removeElement(array,val));
        System.out.println("val = " + val);
        System.out.println(Arrays.toString(array));

        System.out.println("Example 2");
        int[] array2 = {3,2,2,3};
        int val2 = 3;
        System.out.println("length = " + solution.removeElement(array2,val2));
        System.out.println("val2 = " + val2);
        System.out.println(Arrays.toString(array2));

        System.out.println("Example 3");
        int[] array3 = {0,1,2,2,3,0,4,2};
        int val3 = 2;
        System.out.println("length = " + solution.removeElement(array3,val3));
        System.out.println("val3 = " + val3);
        System.out.println(Arrays.toString(array3));
    }
}