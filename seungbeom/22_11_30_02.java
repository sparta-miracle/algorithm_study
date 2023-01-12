// https://school.programmers.co.kr/learn/courses/30/lessons/120848

class Solution {
    public int solution(int n) {
        int answer = 1;
        int factorialNum = 1;
        while (factorialNum * (answer + 1) <= n) {
            answer++;
            factorialNum = factorialNum * answer;
        }

        return answer;
    }
}