// https://school.programmers.co.kr/learn/courses/30/lessons/68935

// 풀이1 (List 사용)
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> remainders = new ArrayList<>();

        while (n != 0) {
            int remainder = n % 3;
            remainders.add(remainder);
            n = n / 3;
        }

        int digit = 1;
        for (int i = remainders.size() - 1; i >= 0; i--) {
            answer += remainders.get(i) * digit;
            digit = digit * 3;
        }

        return answer;
    }
}

// 풀이2 (Stack 사용): 속도가 더 느렸다...
import java.util.Stack;

class Solution {
    public int solution(int n) {
        int answer = 0;
        Stack<Integer> remainders = new Stack<>();

        while (n != 0) {
            int remainder = n % 3;
            remainders.push(remainder);
            n = n / 3;
        }

        int digit = 1;
        while (!remainders.isEmpty()) {
            answer += remainders.pop() * digit;
            digit = digit * 3;
        }

        return answer;
    }
}