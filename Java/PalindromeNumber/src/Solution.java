import java.util.Arrays;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        } else {
            String temp = Integer.toString(x);
            for (int i = 0, j = temp.length() - 1; i < temp.length()/2; i++, j--){
                if(temp.charAt(i) != temp.charAt(j)) return false;
            }
        }
        return true;
    }
}
