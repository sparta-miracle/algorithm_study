class Solution {
    public int solution(long num) { //int로 진행할 시 예외 발생할 수 있음, int로 했을 때도 통과하긴 함
        int count = 0;
        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            }
            else if (num % 2 == 1) {
                num = num * 3 + 1;
            }
            count++;
            if (count == 500) {
                return -1;
            }
        }
    return count;
    }
}
