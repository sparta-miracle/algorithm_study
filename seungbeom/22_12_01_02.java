// https://school.programmers.co.kr/learn/courses/30/lessons/120861

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];

        for (String singleInput : keyinput) {
            switch (singleInput) {
                case "up":
                    answer[1] = Math.min(++answer[1], board[1]/2);
                    break;
                case "down":
                    answer[1] = Math.max(--answer[1], -board[1]/2);
                    break;
                case "right":
                    answer[0] = Math.min(++answer[0], board[0]/2);
                    break;
                case "left":
                    answer[0] = Math.max(--answer[0], -board[0]/2);
                    break;
                default:
                    break;
            }
        }

        return answer;
    }
}