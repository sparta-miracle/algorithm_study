class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int denum = denum1 * num2 + denum2 * num1; //분자
        int num = num1 * num2; //분모
        for(int i = 1; i <= num; i++) { //기약분수
            if(denum % i == 0 && num % i == 0) {
                denum /= i;
                num /= i;
                i = 1;
            }
        }
        int[] answer = {denum, num};
        return answer;
    }
}
