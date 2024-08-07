

import java.util.*;

class Solution {
    public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                char ch = keymap[i].charAt(j);
                if (map.containsKey(ch)) {
                    int idx = map.get(ch);
                    map.put(ch, Math.min(idx, j + 1));
                } else {
                    map.put(ch, j + 1);
                }
            }
        }

        for (int i = 0; i < targets.length; i++) {
            int cnt = 0;
            boolean flag = true;

            for (char c : targets[i].toCharArray()) {
                if (map.containsKey(c)) {
                    cnt += map.get(c);
                } else {
                    flag = false;
                    break;
                }
            }

            answer[i] = flag == false ? -1 : cnt;
        }
        
        return answer;
    }
}