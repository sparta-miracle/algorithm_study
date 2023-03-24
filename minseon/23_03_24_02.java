import java.util.Arrays;

//서울에서 김서방 찾기
// https://school.programmers.co.kr/learn/courses/30/lessons/12919
public class Practice_230324_02 {
    public String solution(String[] seoul) {
        String answer = "";
        if(Arrays.stream(seoul).anyMatch(s->s.equals("Kim"))){
            int where = Arrays.asList(seoul).indexOf("Kim");
            answer = "김서방은 " + where + "에 있다";
        }
        return answer;
    }

    public static void main(String[] args) {
        Practice_230324_02 t = new Practice_230324_02();
        String[] arr = {"Jane","Kim"};
        System.out.println(t.solution(arr));
    }
}
