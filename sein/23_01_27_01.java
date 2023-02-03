/*
두 정수 left와 right가 매개변수로 주어집니다. 
left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
*/

class Solution {
    public int solution(int left, int right) {
        int result = 0;
        
        for(int i=left; i<=right; i++){  //1~2
            int diviCnt = 0;
            
            for(int divi=1; divi<=i; divi++){  //2~12
                if(i%divi==0){
                    diviCnt++;
                }
            }
            
            if(diviCnt%2==0) result += i;
            else result -= i;
        }
        
        return result;
    }
}
