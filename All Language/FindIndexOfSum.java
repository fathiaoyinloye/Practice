import java.util.Arrays;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for(int count = 0; count < nums.length; count++){
            for(int index = count + 1; index < nums.length; index++){
                if(nums[count] + nums [index] == target){
                    result[0] = count;
                    result[1] = index;
                    break;
                }
            }

        }
        return result;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] result = s.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(result));
    }
}