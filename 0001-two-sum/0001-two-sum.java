import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }


        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            //ex) 5(target)-3(index)=2(map.get) , 2+3=5
            //map.get 이 NULL 이 아니다 말은 index 가 해가 된다는 뜻
            Integer k = map.get(target - num);
            if (k != null && k != i) {
                return new int[]{i, k};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
        
    }
}