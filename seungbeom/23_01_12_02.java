// https://school.programmers.co.kr/learn/courses/30/lessons/12940

// 풀이
class Solution {
    public static int[] solution(int n, int m) {
        int gcd = 0;
        for (int i = 1; i <= Math.min(n, m); i++) {
            if (n % i == 0 && m % i == 0) {
                gcd = i;
            }
        }

        // A * B = l * g
        int lcd = n * m / gcd;

        return new int[]{gcd, lcd};
    }
}

// https://ko.wikipedia.org/wiki/%EC%9C%A0%ED%81%B4%EB%A6%AC%EB%93%9C_%ED%98%B8%EC%A0%9C%EB%B2%95
// 유클리드 알고리즘
class Solution {
    public int[] solution(int n, int m) {
        int max = Math.max(n, m);
        int min = Math.min(n, m);

        while (min != 0) {
            int remainder = max % min;
            max = min;
            min = remainder;
        }

        int gcd = max;
        int lcm = n * m / gcd;

        return new int[]{gcd, lcm};
    }
}