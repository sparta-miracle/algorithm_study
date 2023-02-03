// https://school.programmers.co.kr/learn/courses/30/lessons/77884

// 풀이 1
class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            answer = (Math.sqrt(i) % 1 == 0 ? answer - i : answer + i);
        }

        return answer;
    }
}

// 풀이 2 : 최적화... 라고 생각했는데 더 느렸다.
class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            answer = (discriminateSquare(i) ? answer - i : answer + i);
        }

        return answer;
    }

    private boolean discriminateSquare(int i) {
        int j = i % 10;
        if (j == 2 || j == 3 || j == 7 || j == 8) {
            return false;
        }

        return Math.sqrt(i) % 1 == 0;
    }
}

