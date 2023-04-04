//제일 작은 수 제거하기
//https://school.programmers.co.kr/learn/courses/30/lessons/12935

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
 public List<Integer> solution(int[] arr) {

        int minNum = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            if (arr[i] < minNum) {

                minNum = arr[i];
                map.put(minNum, i);
            }
        }

        Integer index = map.get(minNum);
        list.remove((int)index);

        if(list.size()==0){
            list.add(-1);
        }

        return list;
    }
}
