// https://school.programmers.co.kr/learn/courses/30/lessons/87389

class Solution {
    public int solution(int n) {
        for(int i = 2; i < n; i++) {
            if (n%i == 1) {
                return i;
            }
        }

        return 0;
    }
}