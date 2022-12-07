//정수 n과 정수 배열 numlist가 매개변수로 주어질 때, numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.

class Solution {
    public int[] solution(int n, int[] numlist) {
       
        int count = 0;
        int len = 0;
        
        for(int i=0; i<numlist.length; i++){
            if(numlist[i] % n == 0){
                count++;
            }
        }
        
        int[] answer = new int[count];
        for(int j=0; j<numlist.length; j++){
            if(numlist[j]%n == 0){
                answer[len] = numlist[j];
                len++;
            }
        }
        
        return answer;
    }
}
