/*함수 solution은 정수 n을 매개변수로 입력받습니다. 
n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
예를들어 n이 118372면 873211을 리턴하면 됩니다.
*/

import java.util.*;

class Solution {
    public long solution(long n) {
        StringBuilder sb = new StringBuilder();
        String[] list = String.valueOf(n).split("");
//         ArrayList<Integer> list = new ArrayList<>();
    
//         while(n>0){
//            list.add((int)n%10); //나머지 => 자릿수 
//            n = (int)n/10;    //계속 나눠질 수 
//         }
        
        Arrays.sort(list);
        
        for(int i=0; i<list.length; i++){
            sb.append(list[i]);
        }
        
        return Long.parseLong(sb.reverse().toString());
    }
}
