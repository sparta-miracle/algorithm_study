/*
자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.

제한사항
n은 1 이상 100,000,000 이하인 자연수입니다.
*/

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> sb_list = new ArrayList<Integer>();
        
        //1. n을 3진법 -> 3으로 나눈 나머지의 순차
        while(n>=1){
            sb_list.add(n%3);
            n = n/3;
        }
       
        Collections.reverse(sb_list);
        
        //2. 3진법 뒤집기, 10진법으로 표현
        for(int i=0; i<sb_list.size(); i++){
            if(i==0){
               answer += sb_list.get(i);
            }else{
               answer += sb_list.get(i)*Math.pow(3,i);
            }
        }
        
        return answer;
    }
}
