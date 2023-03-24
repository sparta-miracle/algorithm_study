package programmers;

import java.util.ArrayList;
import java.util.List;

public class different_numbers {
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
//        Stack<Integer> stack = new Stack<>();

//        stack.push(arr[0]);
        answer.add(arr[0]);
        int index = 0;

        for (int i = 1; i < arr.length; i++) {
            if (answer.get(index) != arr[i]) {
                answer.add(arr[i]);
                index++;
            }
        }

        return answer;
    }
}
