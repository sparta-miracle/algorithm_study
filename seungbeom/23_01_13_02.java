// https://school.programmers.co.kr/learn/courses/30/lessons/12921

// 풀이1. boolean 배열을 썼을 때
class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] isPrimeArr = new boolean[n + 1];
        for (int i = 0; i < isPrimeArr.length; i++) {
            isPrimeArr[i] = true;
        }

        for (int i = 2; i <= n; i++) {
            if (isPrimeArr[i]) {
                int num = i * 2;
                while (num <= n) {
                    isPrimeArr[num] = false;
                    num += i;
                }
            }
        }

        for (int i = 2; i < isPrimeArr.length; i++) {
            if (isPrimeArr[i]) {
                answer++;
            }
        }

        return answer;
    }
}

// 풀이2. int 배열로 수정했을 때 (조금 더 빠름)
class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] primeArr = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            if (primeArr[i] == 0) {
                int num = i * 2;
                while (num <= n) {
                    primeArr[num] = 1;
                    num += i;
                }
            }
        }

        for (int i = 2; i < primeArr.length; i++) {
            if (primeArr[i] == 0) {
                answer++;
            }
        }

        return answer;
    }
}


