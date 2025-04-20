package org.m3mpm;

public class Solution {
    public int climbStairs(int n) {
        int numberOfWays = 0;
        if (n == 1){
            numberOfWays = 1;
        } else if (n == 2){
            numberOfWays = 2;
        } else if (n > 2){
            numberOfWays = customFibonacci(n);
        }
        return numberOfWays;
    }

    private int customFibonacci(int n) {
        int a = 1, b = 2, c = 0;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
