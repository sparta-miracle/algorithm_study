import java.util.*;

//정수 내림차순으로 배치하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12933?language=java
public class Practice_230321_02 {

    public long solution(long n) {
        long answer = 0;
        long tmp = 0;
        double tmp2 = 0;
        ArrayList<Long> arr = new ArrayList<>();

        //1. 자리수를 쪼개서 배열로 넣어준다.
        while (n>0){
            tmp = n%10;
            n = n/10;
            arr.add(tmp);
        }

        //2. 배열을 내림차순 해준다.
        Collections.sort(arr,Collections.reverseOrder());
        System.out.println("arr 어떻게 나오나2 : " + arr.toString());

        //1은 10의0제곱, 10은 10의1제곱 이런식으로 자리수를 곱해서 정수로 변환해준다.
        for(int i = 0;i<arr.size();i++){
            tmp2 = Math.pow(10,i);
            System.out.println("tmp2 어떻게 나오나2 : " + tmp2);
            answer += arr.get(arr.size()-i-1)*tmp2;
        }

        return answer;
    }
    public static void main(String[] args) {
        Practice_230321_02 t = new Practice_230321_02();
        System.out.println(t.solution(118372));

    }
}
