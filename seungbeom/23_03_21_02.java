// https://school.programmers.co.kr/learn/courses/30/lessons/12930

class Solution {
    public String solution(String s) {
        StringBuilder wordBuilder = new StringBuilder();
        int wordIndex = 0;

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (c == 32) {
                wordIndex = -1;
            } else if (wordIndex % 2 == 0) {
                c = toLowerCase(c);
            } else {
                c = toUpperCase(c);
            }

            ++wordIndex;
            wordBuilder.append(c);
        }

        return wordBuilder.toString();
    }

    public static char toUpperCase(char c) {
        if (c >= 65 && c <= 90) {
            return (char) (c + 32);
        } else {
            return c;
        }
    }

    public static char toLowerCase(char c) {
        if (c >= 96 && c <= 122) {
            return (char) (c - 32);
        } else {
            return c;
        }
    }
}