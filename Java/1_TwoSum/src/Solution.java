public class Solution {
    public int[] twoSum(int[] nums, int target){
        int[] res = new int[2];
        int size = nums.length;
        boolean work = true;
        for(int i = 0; i < size && work; i++){
            for (int j = 0; j < size && work; j++) {
                if (j != i){
                    if (nums[i] + nums[j] == target){
                        res[0] = i;
                        res[1] = j;
                        work = false;
                    }
                }
            }
        }
        return res;
    }
}
