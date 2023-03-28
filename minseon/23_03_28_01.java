import java.lang.reflect.Array;
import java.util.*;

// 실패율  (통과실패)
// https://school.programmers.co.kr/learn/courses/30/lessons/42889
public class Practice_230328_01 {
    // 분모 = n보다 큰수의 개수,
    // 분자 = n이랑 같은수의 개수
    // 해시맵에 키값을 스테이지 번호로 하고, 밸류값을 분모 분자 나눈값으로 해서 넣어줌,
    // 밸류값을 기준으로 내림차순 정렬해줌
    // 밸류 값으로 내림차순 된 해시맵의 키를 뽑아서 answer에 넣어주면 완성
    public ArrayList<Integer> solution(int n, int[] stages) {
        ArrayList<Integer> answer = new ArrayList<>();
        int m = 0; //분모
        int a = 0; //분자

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for (int i = 1; i < n+1; i++) {

            for (int x:stages) {
                if(x == i){
                    a++;
                }
                if (x>=i){
                    m++;
                }

            }
            hashMap.put(i, (a * 10) / m);

            a = 0;
            m = 0;
        }

        List<Integer> listSet  = new ArrayList<>(hashMap.keySet());
        Collections.sort(listSet, (o1, o2) -> (hashMap.get(o2).compareTo(hashMap.get(o1))));
        for (Integer key : listSet) {
            answer.add(key);
               }
        return answer;
    }

    public static void main(String[] args) {
        Practice_230328_01 t = new Practice_230328_01();
        int n = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        System.out.println(t.solution(n, stages));
    }
}
