// https://school.programmers.co.kr/learn/courses/30/lessons/42748

import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int x = 0; x < commands.length; x++) {
            int[] orderedArray = new int[commands[x][1] - commands[x][0] + 1];
            for (int y = commands[x][0] - 1; y < commands[x][1]; y++) {
                orderedArray[y - (commands[x][0] - 1)] = array[y];
            }
            Arrays.sort(orderedArray);
            answer[x] = orderedArray[commands[x][2] - 1];
        }

        return answer;
    }
}