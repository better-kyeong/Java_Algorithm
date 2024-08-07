class Solution {
    public String[] solution(String[] names) {
        int len = names.length;
        int n = 0;
        //names.length % 5 == 0 ? names.length / 5 : names.length / 5 + 1
        if (len <= 5) {
            n = 1;
        } else if (len <= 10) {
            n = 2;
        } else if (len <= 15) {
            n = 3;
        } else if (len <= 20) {
            n = 4;
        } else if (len <= 25) {
            n = 5;
        } else if (len <= 30) {
            n = 6;
        }
        
        String[] answer = new String[n];
        
        int i = 0;
        int idx = 0;
        while (i < names.length) { //for (int i = 0; i < names.length; i+=5) {}
            answer[idx] = names[i];
            idx++;
            i += 5;
        }
        return answer;
    }
}