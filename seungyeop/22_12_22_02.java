class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if (a > b) {
            int c = a;
            a = b;
            b = c;
        }
        for (; a <= b; a++) {
            answer += a;
        }
        return answer;
    }
}
