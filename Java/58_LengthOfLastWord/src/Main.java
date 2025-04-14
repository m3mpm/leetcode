package org.m3mpm;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Solution1 solution1 = new Solution1();
        Solution2 solution2 = new Solution2();

        System.out.println("**Example1**");
        String s1 = "Hello World";
        System.out.println(s1);
        System.out.println(solution1.lengthOfLastWord(s1));
        System.out.println(solution2.lengthOfLastWord(s1));

        System.out.println("**Example2**");
        String s2 = "   fly me   to   the moon  ";
        System.out.println(s2);
        System.out.println(solution1.lengthOfLastWord(s2));
        System.out.println(solution2.lengthOfLastWord(s2));

        System.out.println("**Example3**");
        String s3 = "luffy is still joyboy";
        System.out.println(s3);
        System.out.println(solution1.lengthOfLastWord(s3));
        System.out.println(solution2.lengthOfLastWord(s3));
    }
}