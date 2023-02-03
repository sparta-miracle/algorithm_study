// https://school.programmers.co.kr/learn/courses/30/lessons/120815?language=java

class Solution {
    public int solution(int n) {
        int max = Math.max(n, 6);
        int min = Math.min(n, 6);

        while (min != 0) {
            int temp = max;
            max = min;
            min = temp % min;
        }

        return n / max;
    }
}