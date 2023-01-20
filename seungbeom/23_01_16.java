// https://school.programmers.co.kr/learn/courses/30/lessons/120922

class Solution {
    public int solution(int M, int N) {
        if (M==1 && N==1) {
            return 0;
        }

        int min = Math.min(M, N);
        int max = Math.max(M, N);
        int bigCut = min - 1;
        int smallCut = (max - 1) * min;

        return bigCut + smallCut;
    }
}