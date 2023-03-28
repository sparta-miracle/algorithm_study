import java.util.Arrays;

//서울에서 김서방 찾기
// https://school.programmers.co.kr/learn/courses/30/lessons/12919
public class Practice_230327_02 {
    public int solution(int[] absolutes, boolean[] signs) {
         int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if(signs[i]){
                answer+=absolutes[i];
            }else {
                answer-=absolutes[i];
            }
        }

         return answer;
     }

    public static void main(String[] args) {
        Practice_230327_02 t = new Practice_230327_02();
        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};
        String[] arr = {"Jane","Kim"};
        System.out.println(t.solution(absolutes,signs));
    }
}
