// https://school.programmers.co.kr/learn/courses/30/lessons/120913

class Solution {
    public String[] solution(String my_str, int n) {
        int length = my_str.length() / n;
        if (my_str.length() % n > 0) {
            length++;
        }
        String[] answer = new String[length];

        int i = 0;
        for (int j = 0; j < length; j++) {
            answer[j] = my_str.substring(i, Math.min(i + n, my_str.length()));
            i = i + n;
        }

        return answer;
    }
}