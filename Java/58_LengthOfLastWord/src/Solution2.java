package org.m3mpm;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution2 {
    public int lengthOfLastWord(String s) {
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(s);
        String lastWord = null;

        while (matcher.find()) {
            lastWord = matcher.group();;
        }

        return lastWord.length();
    }
}
