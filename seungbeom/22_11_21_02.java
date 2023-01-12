// https://school.programmers.co.kr/learn/courses/30/lessons/12939
import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] numbers = s.split(" ");
        int min = Integer.parseInt(numbers[0]);
        int max = Integer.parseInt(numbers[0]);
        for (int i = 1; i < numbers.length; i++) {
            int number = Integer.parseInt(numbers[i]);
            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(min)
                .append(" ")
                .append(max);

        return sb.toString();
    }
}