// https://school.programmers.co.kr/learn/courses/30/lessons/64061
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> stack = new ArrayList<>();
        stack.add(0);

        for (int move : moves) {
            move = move - 1;

            for (int i = 0; i < board[0].length; ++i) {
                if (board[i][move] != 0) {
                    int pick = board[i][move];
                    board[i][move] = 0;

                    int pop = stack.get(stack.size() - 1);

                    if (pop == pick) {
                        stack.remove(stack.size() - 1);
                        answer = answer + 2;
                    } else {
                        stack.add(pick);
                    }

                    break;
                }
            }

        }

        return answer;
    }
}