package org.m3mpm;

public class Solution {
    public int[] plusOne(int[] digits) {
        boolean plusOne = true;

        for (int j = digits.length - 1; j >= 0 && plusOne; j--) {
            if (j != 0){
                if (digits[j]==9){
                  digits[j]=0;
                } else {
                    digits[j]++;
                    plusOne = false;
                }
            } else {
                if (digits[j]==9){
                    digits = new int[digits.length+1];
                    digits[0]=1;
                    plusOne = false;
                } else {
                    digits[j]++;
                    plusOne = false;
                }
            }
        }

        return digits;
    }
}
