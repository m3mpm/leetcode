package org.m3mpm;

public class Solution {
    public String addBinary(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();
        int len = Math.max(len1, len2);
        StringBuilder sb = new StringBuilder();
        boolean isOver = false;

        for (int i = 0; i < len; i++) {
            char ch_a = (i < len1) ? a.charAt(len1 - 1 - i) : '0';
            char ch_b = (i < len2) ? b.charAt(len2 - 1 - i) : '0';

            if(ch_a == '0' && ch_b == '0'){
                if(isOver){
                    sb.append('1');
                    isOver = false;
                } else {
                    sb.append('0');
                }
            } else if((ch_a == '1' && ch_b == '0') || (ch_a == '0' && ch_b == '1')){
                if(isOver){
                    sb.append('0');
                } else {
                    sb.append('1');
                }
            } else if (ch_a == '1' && ch_b == '1'){
                if(isOver){
                    sb.append('1');
                } else {
                    sb.append('0');
                    isOver = true;
                }
            }
        }

        if(isOver) sb.append('1');

        return sb.reverse().toString();
    }
}