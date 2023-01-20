// https://school.programmers.co.kr/learn/courses/30/lessons/131705

class Solution {
    int result;

    public int solution(int[] number) {
        result = 0;
        recursive(number, 0, 0, 0);
        return result;
    }

    private void recursive(int[] number, int start, int depth, int sum) {
        if (depth == 3) {
            if (sum == 0) {
                result++;
            }
            return;
        }

        for (int i = start; i < number.length; i++) {
            recursive(number, i + 1, depth + 1, sum + number[i]);
        }
    }
}