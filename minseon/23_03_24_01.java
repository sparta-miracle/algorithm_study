// 크레인 인형뽑기 게임
// https://school.programmers.co.kr/learn/courses/30/lessons/64061

import java.util.*;
class Solution {
      public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int i = 0;
        Stack<Integer> stack = new Stack<>();
        //bord 배열을 어레이 리스트로 바꿔주자.
        //stack에 0을 먼저 넣어줘서 아웃오브인덱스 안나게 하자.
        stack.push(0);
        //moves의 길이만큼 인형을 잡아야하니까 for문이 아니라 while문을 돌려야 한다.
        while(i<moves.length){
            for (int x = 0; x < board.length; x++) {
                if(!(board[x][moves[i]-1]==0)){
                  //만약의 moves가 가르키는 보드의 값이 0이 아니라면 (인형이 잡혔다면)
                    Integer pop = stack.pop();
                    if(pop.equals(board[x][moves[i]-1])){
                        //스택에서 꺼낸 값이랑 인형의 값이랑 같다면
                        // 똑같은거 지우는 인형의 개수를 세어줌
                        answer +=2;
                        //꺼낸 데이터는 0만들기
                        board[x][moves[i]-1] = 0;
                    }else {
                        //스택에서 꺼낸 값이랑 인형의 값이랑 같지 않다면
                        //꺼냈던 스택 다시 집어넣고
                        stack.push(pop);
                        //인형을 스택에 집어넣어줌.
                        stack.push(board[x][moves[i]-1]);
                        //꺼낸 데이터는 0만들기
                        board[x][moves[i]-1] = 0;
                    }
                    //배열의 값은 0으로 바꿈 < 근데 배열은 한번 선언되면 변경이 불가능하잖아...(어레이리스트로 바꿔야겠네..)
                    //(배열사이즈가 변경 불가능한거였다니..!! 데이터값은 변경 가능하다니..! 몰랐네..ㄷㄷ)
                    break;
                }
            }
            i++;
        }

           return answer;
       }

}
