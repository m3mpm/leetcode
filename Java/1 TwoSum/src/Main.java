import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Solution solution = new Solution();
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(solution.twoSum(nums,target)));
    }
}