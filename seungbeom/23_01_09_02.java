// https://school.programmers.co.kr/learn/courses/30/lessons/12932

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    // 풀이
    public int[] solution(long n) {
        List<Integer> answer = new ArrayList<>();
        while (n != 0) {
            answer.add((int) (n % 10));
            n = n / 10;
        }

        // answer.toArray(new Integer[0] -> Integer 리스트(List<Integer>)인 answer를 Integer 배열(Integer[])로 바꾸는 함수입니다.
        // Arrays.stream으로 stream을 생성합니다.
        // mapToInt() 메소드를 이용해서 Integer 배열안에 들어있는 값들을 int형으로 바꾸어줍니다. (Integr[]가 기본 자료형인 정수형 배열(int[])이 됩니다.)
        // toArray() 메소드를 이용해 스트림에 담긴 정수형 배열을 꺼내줍니다.
        return Arrays.stream(answer.toArray(new Integer[0])).mapToInt(Integer::intValue).toArray();
    }

    // 모범 풀이
    public int[] solution(long n) {
        int[] answer = new int[String.valueOf(n).length()];

        for (int i = 0; i < answer.legnth; i++) {
            answer[i] = n%10;
            n = n/10;
        }

        return answer;
    }
}
