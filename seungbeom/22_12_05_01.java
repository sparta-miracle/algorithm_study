// https://school.programmers.co.kr/learn/courses/30/lessons/120878

class Solution {
    public int solution(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        while (max % min != 0) {
            int temp = max % min;
            max = min;
            min = temp;
        }

        if (b % min == 0) {
            b = b / min;
        }

        while ( b % 2 == 0 ) {
            b = b / 2;
        }

        while ( b % 5 == 0 ) {
            b = b / 5;
        }

        if (b == 1) {
            return 1;
        } else {
            return 2;
        }
    }
}