// https://school.programmers.co.kr/learn/courses/30/lessons/134240

class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        sb.append("0");

        for (int i = food.length - 1; i > 0; i--) {
            int count = food[i] / 2;
            while (count != 0){
                sb.insert(0, i);
                sb.append(i);
                count = count - 1;
            }
        }
        return sb.toString();
    }
}