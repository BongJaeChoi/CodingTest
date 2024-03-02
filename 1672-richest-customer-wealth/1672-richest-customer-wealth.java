import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

class Solution {
    public int maximumWealth(int[][] accounts) {
        ArrayList<Integer> result = new ArrayList<>();
        int[] temp = new int[accounts.length];

        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                temp[i] += accounts[i][j];
            }
            result.add(temp[i]);
        }


        return result.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList())
                .get(0);
    }
}