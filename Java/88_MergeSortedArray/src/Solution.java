package org.m3mpm;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0, j = 0; j < nums2.length & i < nums1.length ;) {
            if (nums1[i] <= nums2[j] && i < m) {
                i++;
            } else if (nums1[i] <= nums2[j] && i >= m) {
                insertAt(i++,nums1,nums2[j++],m++);
            } else {
                insertAt(i++,nums1,nums2[j++],m++);
            }
        }
    }

    private void insertAt(int index, int[] nums, int val, int size) {
        for (int i = size; i > index; i--) {
            nums[i] = nums[i - 1];
        }
        nums[index] = val;
    }
}
