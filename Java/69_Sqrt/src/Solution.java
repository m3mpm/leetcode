package org.m3mpm;

class Solution {
    public int mySqrt(int x) {

        if (x == 0) {
            return 0;
        }

        double precision = 1e-10;
        double guess = x / 2.0;
        double newGuess = 0.0;

        while (true) {
            newGuess = (guess + x / guess) / 2.0;
            if (Math.abs(newGuess - guess) < precision) {
                break;
            }
            guess = newGuess;
        }
        return (int)newGuess;
    }
}