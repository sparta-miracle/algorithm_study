package programmers;

public class CaesarCipher {
    public String solution(String s, int n) {
        String answer = "";
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == ' ') {
                answer += " ";
                continue;
            }

            if (c <= 90) { // 소문자
                char newC = (char) (c + n);
                if (newC > 90) {
                    answer += (char) (newC - 26);
                    continue;
                } else {
                    answer += newC;
                }
            } else if (c >= 97) { // 대문자
                char newC = (char) (c + n);
                if (newC > 122) {
                    answer += (char) (newC - 26);
                    continue;
                } else {
                    answer += newC;
                }
            }

        }
        return answer;
    }

}
