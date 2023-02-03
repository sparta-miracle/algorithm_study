// https://school.programmers.co.kr/learn/courses/30/lessons/138477

// 풀이 1
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> hallOfFame = new ArrayList<>(k);

        for (int i = 0; i < score.length; i++) {
            if (hallOfFame.size() != k) {
                hallOfFame.add(score[i]);
            } else if (hallOfFame.get(k - 1) < score[i]){
                hallOfFame.set(k - 1, score[i]);
            }

            Collections.sort(hallOfFame, Collections.reverseOrder());
            answer[i] = hallOfFame.get(hallOfFame.size() - 1);
        }

        return answer;
    }
}

// Priority Queue
import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> hallOfFame = new PriorityQueue<>(k);

        for (int i = 0; i < score.length; i++) {
            if (hallOfFame.size() != k) {
                hallOfFame.add(score[i]);
            } else {
                int max = Math.max(hallOfFame.poll(), score[i]);
                hallOfFame.add(max);
            }

            answer[i] = hallOfFame.peek();
        }

        return answer;
    }
}
