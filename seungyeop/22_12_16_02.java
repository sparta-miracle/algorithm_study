//1. 2진수로 만든다. -> 2로 나누면서 2번까지 진행할 경우 2진수의 끝자리부터 넣어줘야 한다.
    //-> 왼쪽으로 넣어줘야 한다. -> + 연산자를 쓰면 가볍게 붙일 수 있음
//2. 둘 중 하나만 1이어도 #을 넣어준다.

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) { //라인 별 특징
            String temp = ""; //라인마다 새로 생성해주는 임시 저장소
            for (int j = 1; j <= n; j++) {
                if (arr1[i] % 2 == 1 || arr2[i] % 2 == 1) { //두 수의 나머지 중 1개 이상 1인 경우 #추가
                    temp = "#" + temp;
                }
                else {
                    temp = " " + temp;
                }
                arr1[i] /= 2;
                arr2[i] /= 2;
            }
            answer[i] = temp;   //정답에 넣어주기
        }
        return answer;
    }
}
