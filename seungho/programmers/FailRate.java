package programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FailRate {
    public int[] solution(int n, int[] stages) {
        int[] answer = new int[n];
        Map<Integer, Double> map = new HashMap<>();
        int[] stageMembers = new int[n + 1];
        int[] fails = new int[n + 1];

        for (int stage : stages) {
            for (int s = 0; s < stage; s++) {
                stageMembers[s] += 1;
            }
            fails[stage - 1] += 1;
        }

        for (int i = 0; i < n; i++) {
            if (stageMembers[i] != 0) {
                map.put(i + 1, (double) fails[i] / stageMembers[i]);
            } else {
                map.put(i + 1, 0.0);
            }
        }
        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort((o1, o2) -> {
            double rate1 = map.get(o1);
            double rate2 = map.get(o2);
            if (rate1 == rate2) {
                return o1 > o2 ? 1 : -1;
            } else {
                return rate1 > rate2 ? -1 : 1;
            }
        });
        int idx = 0;
        for (int key : keySet) {
            answer[idx++] = key;
        }
        return answer;
    }

}
