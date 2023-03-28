// https://school.programmers.co.kr/learn/courses/30/lessons/12919

class Solution {
    public String solution(String[] seoul) {
        StringBuilder sb = new StringBuilder();
        sb.append("김서방은 ");
        for (int i = 0; i < seoul.length; ++i) {
            if (seoul[i].equals("Kim")) {
                sb.append(i);
                break;
            }
        }
        sb.append("에 있다");
        return sb.toString();
    }
}