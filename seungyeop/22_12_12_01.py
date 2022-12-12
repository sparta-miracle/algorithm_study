class Solution {    //정수 형식에서 비교하는 방식이 가장 빠름
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (; i <= j; i++) {
            if (Integer.toString(i).contains(Integer.toString(k))) {
                for (int l = 0; l < Integer.toString(i).length(); l++) {
                    if (Integer.toString(i).charAt(l) == (char)(k+'0')) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}

// class Solution { //계산해서 풀기가 가장 빠름
//     public int solution(int i, int j, int k) {
//         int answer = 0;

//         for (int num = i; num <= j; num++){
//             int tmp = num;
//             while (tmp != 0){
//                 if (tmp % 10 == k)
//                     answer++;
//                 tmp /= 10;
//             }
//         }
//         return answer;
//     }
// }
