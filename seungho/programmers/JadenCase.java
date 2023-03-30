package programmers;

import java.util.StringTokenizer;

public class JadenCase {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        char[] charArray = s.toCharArray();
        int length = charArray.length;
        int index = 0;
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            index += token.length();
            char firstChar = token.charAt(0);
            if (firstChar >= 97 && firstChar <= 122) {
                firstChar -= 32;
            }
            answer.append(firstChar + token.substring(1).toLowerCase());
            while (index < length && charArray[index] == ' ') {
                answer.append(" ");
                index++;
            }
        }
        return answer.toString();
    }
}
