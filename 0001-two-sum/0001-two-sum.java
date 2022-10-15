import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }


        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            Integer k = map.get(target - num);
            if (k != null && k != i) {
                return new int[]{i, k};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
        
    }
}