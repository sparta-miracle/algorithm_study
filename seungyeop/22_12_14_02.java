class Solution {
    public int solution(int[][] dots) {     //dots이 정수형이므로 나누기하였을 때 정상적으로 계산되지 않음
        for (int i = 0; i < 3; i++) {       //네 번째 인덱스 값을 고정으로 두고 1~3번째 값을 돌려가며 대입
            // if ((dots[3][0] - dots[i][0]) / (dots[3][1] - dots[i][1])    //나누기 값이 정수로 비교가 정상적이지 않음
            //    == (dots[(i + 1) % 3][0] - dots[(i + 2) % 3][0]) / (dots[(i + 1) % 3][1] - dots[(i + 2) % 3][1])) {
            if ((dots[3][0] - dots[i][0]) * (dots[(i + 1) % 3][1] - dots[(i + 2) % 3][1])   //기울기 x, y 순서 뒤집어짐
               == (dots[(i + 1) % 3][0] - dots[(i + 2) % 3][0]) * (dots[3][1] - dots[i][1])) {
                return 1;
            }
        }
        return 0;
    }
}
