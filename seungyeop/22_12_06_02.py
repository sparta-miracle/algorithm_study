class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 1;
        for (int i = 1; i < k; i ++) {
            if (answer == numbers.length - 1) {
                answer = 1;
            }
            else if (answer == numbers.length) {
                answer = 2;
            }
            else {
                answer += 2;
            }
        }
        return answer;
    }
}
// class Solution {     //가장 간단하고 직관적인 답
//     public int solution(int[] numbers, int k) {
//         return (k-1)*2 % numbers.length+1;
//     }
// }
