package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class WeiredSort {
    public int[] solution(int[] numlist, int n) {
        for (int i = 0; i < numlist.length; i++) {
            numlist[i] -= n;
        }
        Integer[] nums = Arrays.stream(numlist).boxed().toArray(Integer[]::new);

        Arrays.sort(nums, new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                int a1 = Math.abs(i1);
                int a2 = Math.abs(i2);
                if (a1 == a2) {
                    return i1 > i2 ? -1 : 1;
                } else {
                    return a1 - a2;
                }
            }
        });
        int[] answer = Arrays.stream(nums).mapToInt(Integer::intValue).toArray();
        for (int i = 0; i < answer.length; i++) {
            answer[i] += n;
        }
        return answer;
    }
}
