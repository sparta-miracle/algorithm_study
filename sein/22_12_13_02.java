//다음 그림과 같이 지뢰가 있는 지역과 지뢰에 인접한 위, 아래, 좌, 우 대각선 칸을 모두 위험지역으로 분류합니다.
//지뢰는 2차원 배열 board에 1로 표시되어 있고 board에는 지뢰가 매설 된 지역 1과, 지뢰가 없는 지역 0만 존재합니다.
//지뢰가 매설된 지역의 지도 board가 매개변수로 주어질 때, 안전한 지역의 칸 수를 return하도록 solution 함수를 완성해주세요.


/*정확성 68.점 통과못함 -> 다시 풀어 볼 것 */
class Solution {
    public int solution(int[][] board) {
        int[][] clipboard = new int[board.length][board[0].length];
        int count = 0;
        int totLength = board.length * board[0].length;

        //배열 깊은 복사
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                clipboard[i][j] = board[i][j];
            }
        }
        //기준점 찾아서 0->1 바꿔주기
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j]==1){
                    count += setBoard(clipboard, i, j);
                }
            }
        }
        return totLength-count;
    }

    //기준점 주변 0을 1로 변경 메소드
    public int setBoard(int[][] clipboard, int i, int j){
        int tempCount = 0;

            if((i-1<0)){i+=1;};
            if((i+1)>=clipboard.length) {i-=1;};
            if((j-1<0)){j+=1;};
            if((j+1)>=clipboard.length){j-=1;};
        
            if((j==0)){
                if(clipboard[i][j] == 1){ tempCount++;}
                if(clipboard[i-1][j+1] !=1 ){ clipboard[i-1][j+1]=1; tempCount++;};
                if(clipboard[i+1][j+1] !=1 ){ clipboard[i+1][j+1]=1; tempCount++;};
                if(clipboard[i][j+1] !=1 ){ clipboard[i][j+1]=1; tempCount++;};
                if(clipboard[i+1][j] !=1 ){ clipboard[i+1][j]=1; tempCount++;};
                if(clipboard[i-1][j] !=1 ){ clipboard[i-1][j]=1; tempCount++;};
            }
            if((i==0)){
                if(clipboard[i][j] == 1){ tempCount++;}
                if(clipboard[i+1][j-1] !=1 ){ clipboard[i+1][j-1]=1; tempCount++;};
                if(clipboard[i+1][j+1] !=1 ){ clipboard[i+1][j+1]=1; tempCount++;};
                 if(clipboard[i][j-1] !=1){  clipboard[i][j-1]=1; tempCount++;}
                if(clipboard[i][j+1] !=1 ){ clipboard[i][j+1]=1; tempCount++;};
                if(clipboard[i+1][j] !=1 ){ clipboard[i+1][j]=1; tempCount++;};
            }
        
            if((i!=0) && (j!=0)){
                if(clipboard[i][j] == 1){ tempCount++;}
                if(clipboard[i-1][j-1] !=1 ){ clipboard[i-1][j-1]=1; tempCount++;};
                if(clipboard[i-1][j+1] !=1 ){ clipboard[i-1][j+1]=1; tempCount++;};
                if(clipboard[i+1][j-1] !=1 ){ clipboard[i+1][j-1]=1; tempCount++;};
                if(clipboard[i+1][j+1] !=1 ){ clipboard[i+1][j+1]=1; tempCount++;};
                if(clipboard[i][j-1] !=1){  clipboard[i][j-1]=1; tempCount++;}
                if(clipboard[i][j+1] !=1 ){ clipboard[i][j+1]=1; tempCount++;};
                if(clipboard[i+1][j] !=1 ){ clipboard[i+1][j]=1; tempCount++;};
                if(clipboard[i-1][j] !=1 ){ clipboard[i-1][j]=1; tempCount++;};
            }else{
                tempCount++;
            }
        return tempCount;
    }
}
