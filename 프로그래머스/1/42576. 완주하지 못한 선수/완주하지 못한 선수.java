import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
         HashMap<String, Integer> map = new HashMap<>();
        for (String key : participant) {
            int current = map.getOrDefault(key, 0);
            map.put(key, current + 1);
        }

        for (String key : completion) {
            int current = map.getOrDefault(key, 0);
            map.put(key, current - 1);
        }

        String answer = "";
        return map.entrySet()
                .stream()
                .filter(stringIntegerEntry -> stringIntegerEntry.getValue() > 0)
                .findFirst()
                .get()
                .getKey();
    }
}