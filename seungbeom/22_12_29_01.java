// https://school.programmers.co.kr/learn/courses/30/lessons/120839

class Solution {
    public String solution(String rsp) {
        StringBuilder answerBuilder = new StringBuilder();

        for (int i = 0; i < rsp.length(); i++) {
            switch (rsp.charAt(i)) {
                case '0':
                    answerBuilder.append('5');
                    break;
                case '2':
                    answerBuilder.append('0');
                    break;
                case '5':
                    answerBuilder.append('2');
                    break;
                default:
                    break;
            }
        }

        return answerBuilder.toString();
    }
}