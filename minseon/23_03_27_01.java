import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//서울에서 김서방 찾기
// https://school.programmers.co.kr/learn/courses/30/lessons/12919
public class Practice_230327_01 {

    //1. 중복을 제거한다.
    //2. 중복을 제거한 배열의 길이가 그냥 배열의 길이 나누기2와 같거나 크면 2분의1 값
    //3. 중복을 제거한 배열의 길이가 더 작으면 배열의 길이값
    public int solution(int[] nums) {
        int answer = 0;
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            integers.add(nums[i]);
        }
        Set<Integer> set = new HashSet<>(integers);

        if(set.size()>=nums.length/2){
            answer = nums.length/2;
        }else {
            answer = set.size();
        }

        return answer;
    }

    public static void main(String[] args) {
        Practice_230327_01 t = new Practice_230327_01();
        int[] absolutes = {3,3,3,2,2,2};
        System.out.println(t.solution(absolutes));
    }
}
