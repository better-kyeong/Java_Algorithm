import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        List<Integer> list = new ArrayList<>();

        for (int ing : ingredient) {
            list.add(ing);

            if (list.size() >= 4 && 
                    list.get(list.size()-4) == 1 &&
                    list.get(list.size()-3) == 2 &&
                    list.get(list.size()-2) == 3 &&
                    list.get(list.size()-1) == 1) {
                {
                    answer++;
                    for (int i = 0; i < 4; i++) {
                        list.remove(list.size() - 1);
                    }
                }
            }
        }
        return answer;
    }
}