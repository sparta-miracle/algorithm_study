class Solution {    //다른 사람 풀이 중 좋았던 것: newBoard 길이를 +2 씩 늘리고 제외 범위 없이 입력 후 기존 범위만 카운트
    public int solution(int[][] board) {
        int answer = 0;
        int n = board.length;
        int[][] newBoard = new int[n][n];    //board와 똑같은 크기의 newBoard 생성
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {     //board의 값이 1이라면 newBoard 주변 값에 1을 넣음
                    for (int k = i - 1; k <= i + 1; k++) {
                         for (int l = j - 1; l <= j + 1; l++) {
                            if (k > -1 && k < n && l > -1 && l < n) {   //board 범위를 벗어나는 경우 제외
                                newBoard[k][l] = 1;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (newBoard[i][j] == 0) {      //안전지대 개수 카운트
                    answer += 1;
                }
            }
        }
        return answer;
    }
}
