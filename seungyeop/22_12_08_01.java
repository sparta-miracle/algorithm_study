class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        // answer[0] = 0;   // 초기값 영으로 들어옴
        for (int i = 0; i < array.length; i++) {    //하나의 for문 안에서 해결 가능 했음
            if (array[i] > answer[0]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        // for (int j = 0; j < array.length; j++) {
        //     if (array[j] == answer[0]) {
        //         answer[1] = j;
        //     }
        // }
        return answer;
    }
}
