class Solution {
    public long solution(int price, int money, int count) {
        long cost = 0;  // 비용이 상당히 클 경우 int로 다 안 받아짐
        for (int i = 1; i <= count; i++) {
            cost += price * i;
        }
        long answer = 0;
        if (cost - money > 0) {
            answer = cost - money;
        }
        return answer;
    }
}
