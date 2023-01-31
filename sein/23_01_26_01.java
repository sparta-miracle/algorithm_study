/*
정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.

제한사항
numbers의 길이는 2 이상 100 이하입니다.
numbers의 모든 수는 0 이상 100 이하입니다.
*/

/*
승범님 혹시라도 제 코드를 보시게 된다면..ㅎㅎ 
저처럼 풀었을 경우에 테스트 7번에서 시간이 오래걸리기 때문에 그렇게 좋은 방법은 아닌 것 같습니다ㅜㅜ 참고해주세용~! 

테스트 1 〉	통과 (0.03ms, 74.3MB)
테스트 2 〉	통과 (0.05ms, 71.2MB)
테스트 3 〉	통과 (0.06ms, 77.5MB)
테스트 4 〉	통과 (0.07ms, 70.8MB)
테스트 5 〉	통과 (0.25ms, 75MB)
테스트 6 〉	통과 (1.41ms, 74.5MB)
테스트 7 〉	통과 (6.49ms, 77.1MB)
테스트 8 〉	통과 (1.54ms, 75.8MB)
테스트 9 〉	통과 (0.76ms, 70.1MB)

*/

import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        int temp = 0;

  
        for(int i=0; i<numbers.length-1; i++){
            for(int k=i+1; k<numbers.length; k++){
                if(numbers[i]>numbers[k]){
                    temp = numbers[i];
                    numbers[i] = numbers[k];
                    numbers[k] = temp;
                }
            }
        }
        
        
        for(int i=0; i<numbers.length-1; i++){
            for(int k=i+1; k<numbers.length; k++){
                sum = numbers[i] + numbers[k];
                
                if(!list.contains(sum)) list.add(sum);
            }
        }
        
        for(int i=0; i<list.size()-1; i++){
            for(int k=i+1; k<list.size(); k++){
                if(list.get(i)>list.get(k)){
                    temp = list.get(i);
                    list.set(i, list.get(k));
                    list.set(k, temp);
                }
            }
        }
        
        return list;
       
    }
}
