// https://school.programmers.co.kr/learn/courses/30/lessons/12916

class Solution {
    boolean solution(String s) {
        int count = 0;

        for ( int i = 0; i < s.length(); i++ ) {
            char alphabet = s.charAt(i);
            if (alphabet == 'p' || alphabet == 'P') {
                count++;
            } else if (alphabet == 'y' || alphabet == 'Y') {
                count--;
            }
        }

        return count == 0;
    }
}