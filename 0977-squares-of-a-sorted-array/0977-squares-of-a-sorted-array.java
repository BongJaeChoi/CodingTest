import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        ArrayList<Integer> answer = new ArrayList<>(nums.length);
        for (int num : nums) {
            answer.add(num * num);
        }

        return answer.stream()
                .sorted()
                .mapToInt(x -> x)
                .toArray();
    }
}