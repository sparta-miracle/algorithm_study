package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveMinValue {
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        Arrays.sort(temp);
        int min = temp[0];
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min && flag) {
                flag = false;
                continue;
            }
            answer.add(arr[i]);
        }
        if (answer.isEmpty()) {
            answer.add(-1);
        }

        return answer;
    }
}
