// https://school.programmers.co.kr/learn/courses/30/lessons/12943

class Solution {
    public int solution(int num) {
        int answer = 0;
        long colNum = num;

        while (colNum != 1) {
            colNum = (colNum % 2 == 0) ? colNum / 2 : colNum * 3 + 1;
            answer++;
            if (answer == 500) {
                answer = -1;
                break;
            }
        }

        return answer;
    }
}