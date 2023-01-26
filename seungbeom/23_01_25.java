// https://school.programmers.co.kr/learn/courses/30/lessons/12982

import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int count = 0;
        Arrays.sort(d);
        for (int i : d) {
            budget = budget - i;
            if (budget < 0) {
                return count;
            } else {
                count++;
            }
        }

        return count;
    }
}