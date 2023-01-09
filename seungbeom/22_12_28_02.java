// https://school.programmers.co.kr/learn/courses/30/lessons/133502

// 빵 - 고기 - 야채 - 빵
// 배열을 순회하며(이때 순회하는 위치를 포인터라고 함) 빵 - 고기 - 야채 - 빵의 순서가 일치하면 +1, 순서가 틀리면 다시 포인터를 처음으로 되돌린다.

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        List<Integer> workbench = new ArrayList<>();
        int pointer = 0;

        for (int num : ingredient) {
            workbench.add(num);

            if (workbench.size() >= 4) {
                if (workbench.get(workbench.size() - 4) != 1) {
                    continue;
                }

                if (workbench.get(workbench.size() - 3) != 2) {
                    continue;
                }

                if (workbench.get(workbench.size() - 2) != 3) {
                    continue;
                }

                if (workbench.get(workbench.size() - 1) != 1) {
                    continue;
                }

                workbench.remove(workbench.size() - 4);
                workbench.remove(workbench.size() - 3);
                workbench.remove(workbench.size() - 2);
                workbench.remove(workbench.size() - 1);

                answer++;
            }
        }

        return answer;
    }
}