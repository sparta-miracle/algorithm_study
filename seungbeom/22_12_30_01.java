// https://school.programmers.co.kr/learn/courses/30/lessons/81301
class Solution {
    // 풀이
    public int solution(String s) {
        StringBuilder wordBuilder = new StringBuilder();
        StringBuilder answerBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!isNumber(c)) {
                wordBuilder.append(c);
            } else {
                answerBuilder.append(c);
            }

            char word = translate(wordBuilder.toString());
            if (word != '-') {
                answerBuilder.append(word);
                wordBuilder = new StringBuilder();
            }
        }

        return Integer.parseInt(answerBuilder.toString());
    }

    private boolean isNumber(char c) {
        if (c < 48 || c > 57) {
            return false;
        }
        return true;
    }

    private char translate(String s) {
        switch (s) {
            case ("zero"):
                return '0';
            case ("one"):
                return '1';
            case ("two"):
                return '2';
            case ("three"):
                return '3';
            case ("four"):
                return '4';
            case ("five"):
                return '5';
            case ("six"):
                return '6';
            case ("seven"):
                return '7';
            case ("eight"):
                return '8';
            case ("nine"):
                return '9';
            default:
                return '-';
        }
    }

    // 모범 풀이
    public int solution(String s) {
        String[] words = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for (int i = 0; i < words.length; i++) {
            s = s.replaceAll(words[i], String.valueOf(i));
        }
        return Integer.parseInt(s);
    }
}