class Solution {
    public String solution(int n) {
        String answer = "";
        StringBuilder answerBuilder = new StringBuilder();

        for (int i = 0; i < n/2; i++) {
            answerBuilder.append("수박");
        }

        if ( n%2 == 1) {
            answerBuilder.append("수");
        }

        return answerBuilder.toString();
    }
}