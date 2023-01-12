// https://school.programmers.co.kr/learn/courses/30/lessons/120834

class Solution {
    public String solution(int age) {
        StringBuilder ageConverter = new StringBuilder();
        while (age != 0) {
            ageConverter.insert(0, (char) (age % 10 + 97));
            age = age / 10;
        }
        return ageConverter.toString();
    }
}