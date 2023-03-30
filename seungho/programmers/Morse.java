package programmers;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Morse {
    public String solution(String letter) {
        StringBuilder answer = new StringBuilder();
        String[] morse = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-",
                "...-", ".--", "-..-", "-.--", "--.."};
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            map.put(morse[i], String.valueOf((char) (i + 97)));
        }

        StringTokenizer st = new StringTokenizer(letter);
        while (st.hasMoreTokens()) {
            String alphabet = map.get(st.nextToken());
            answer.append(alphabet);
        }

        return answer.toString();
    }
}
