import java.util.ArrayList;

//같은 숫자는 싫어
// https://school.programmers.co.kr/learn/courses/30/lessons/12906
public class Practice_230323_02 {

    public int[] solution(int []arr) {
        //배열을 넣을때 이전 인덱스랑 비교해서 같지 않으면 추가.
        ArrayList<Integer> arrayList = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            if(i == 0){
                arrayList.add(arr[i]);
            }else if(!(i == 0)){
                if (!(arr[i-1]==arr[i])) {
                    arrayList.add(arr[i]);
                }
            }
        }
        System.out.println("arrayList 의 값이 뭐지? " + arrayList.toString());
        int[] answer = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }

        return answer;
    }
    public static void main(String[] args) {
        Practice_230323_02 t = new Practice_230323_02();
        int[] arr = {1,1,3,3,0,1,1};
        System.out.println(t.solution(arr));

    }
}
