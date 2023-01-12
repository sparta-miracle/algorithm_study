// https://school.programmers.co.kr/learn/courses/30/lessons/120835

class Solution {
    public int[] solution(int[] emergency) {
        int[] order = new int[emergency.length];

        for (int i = 0; i < emergency.length; i++) {
            int count = 1;
            for (int j = 0; j < emergency.length; j++) {
                if (emergency[i] < emergency[j]) {
                    count++;
                }
            }
            order[i] = count;
        }

        return order;
    }
}