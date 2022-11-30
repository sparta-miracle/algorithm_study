class Solution {
    public int solution(int n) {
        int answer = 0;
        int F = 1;
        while(F <= n) {
            answer += 1;
            F *= answer;
        }
        return answer - 1;
    }
}
