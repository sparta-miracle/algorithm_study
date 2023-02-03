// https://school.programmers.co.kr/learn/courses/30/lessons/68644

// 풀이 1. HashSet + List (느림)
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if (!set.contains(sum)) {
                    answer.add(sum);
                    set.add(sum);
                }
            }
        }

        answer.sort(Comparator.naturalOrder());
        return answer.stream().mapToInt(i -> i).toArray();
    }
}

// 풀이 2. TreeSet (느림)
import java.util.TreeSet;

class Solution {
    public int[] solution(int[] numbers) {
        TreeSet<Integer> answer = new TreeSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                answer.add(numbers[i] + numbers[j]);
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}

// 풀이 3. HashSet + Arrays (가장 빠름)... Stream을 사용하지 않아서 빨랐다.
// https://sigridjin.medium.com/java-stream-api%EB%8A%94-%EC%99%9C-for-loop%EB%B3%B4%EB%8B%A4-%EB%8A%90%EB%A6%B4%EA%B9%8C-50dec4b9974b
import java.util.HashSet;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < numbers.length-1; i++) {
            for(int j = i+1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[set.size()];
        int i = 0;
        for (Integer integer : set) {
            answer[i++] = integer;
        }
        Arrays.sort(answer);
        return answer;
    }
}