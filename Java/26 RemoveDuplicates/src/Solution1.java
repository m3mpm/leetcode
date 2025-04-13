package org.m3mpm;

import java.util.ArrayList;

public class Solution1 {
    public int removeDuplicates(int[] nums) {
        boolean isDuplicate = false;
        if (nums == null || nums.length == 0) {
            return 0;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(i != 0){
                isDuplicate = nums[i] == nums[i - 1];
            }
            if (!isDuplicate)
                list.add(nums[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }

        return list.size();
    }
}
