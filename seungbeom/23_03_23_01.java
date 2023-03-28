// https://school.programmers.co.kr/learn/courses/30/lessons/12926

class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int alphabetCode = s.charAt(i);
            char encryptAlphabet = (char) (alphabetCode + n);

            if (alphabetCode == 32) {
                encryptAlphabet = (char) alphabetCode;
            } else if (alphabetCode >= 65 && alphabetCode <= 90 && encryptAlphabet > 90) {
                encryptAlphabet = (char) (encryptAlphabet - 26);
            } else if (alphabetCode >= 97 && alphabetCode <= 122 && encryptAlphabet > 122) {
                encryptAlphabet = (char) (encryptAlphabet - 26);
            }

            sb.append(encryptAlphabet);
        }

        return sb.toString();
    }
}