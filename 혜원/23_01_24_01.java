import java.util.*;

public class Solution {
        public int[] solution(int k, int[] score) {
            int length = score.length;
            int[] answer = new int[score.length];
            List<Integer>å topKList = new ArrayList<>();

            for (int i = 0; i < length; i++) {
                if (topKList.size() < k) {
                    topKList.add(score[i]);
                } else {
                    if (topKList.get(0) < score[i]) {
                        topKList.set(0, score[i]);
                    }
                }
                Collections.sort(topKList);
                answer[i] = topKList.get(0);
            }

        return answer;

    }
}
