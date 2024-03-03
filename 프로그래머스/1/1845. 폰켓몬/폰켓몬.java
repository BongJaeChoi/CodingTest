import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] nums) {
  HashSet<Integer> set = new HashSet<>();
        for (int nums2 : nums) {
            set.add(nums2);
        }
        int len = nums.length / 2;
        if (set.size() > len) {
            return len;
        } else {
            return set.size();
        }
    }
}