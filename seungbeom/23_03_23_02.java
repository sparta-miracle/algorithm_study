// https://school.programmers.co.kr/learn/courses/30/lessons/12906

// 방법1: 스트림 -> array (느림)
import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();

        int cursor = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != cursor) {
                answer.add(arr[i]);
                cursor = arr[i];
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}

// 방법2: list에서 직접 반복문을 이용해 array로 옮김 (더 빠름)
import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        List<Integer> tempList = new ArrayList<>();

        int cursor = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != cursor) {
                tempList.add(arr[i]);
                cursor = arr[i];
            }
        }

        int[] answerArray = new int[tempList.size()];
        for (int i = 0; i < answerArray.length; i++) {
            answerArray[i] = tempList.get(i);
        }

        return answerArray;
    }
}