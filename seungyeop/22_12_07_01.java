class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        if (num % 2 == 0) {
            int min = total / num - num / 2 + 1;
            for (int i = 0; i < num; i++) {
                answer[i] = min;
                min++;
            }
        }
        else {
            int min = total / num - num / 2;
            for (int j = 0; j < num; j++) {
                answer[j] = min;
                min++;
            }
        }
        return answer;
    }
}
