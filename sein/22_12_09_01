/*
첫 번째 분수의 분자와 분모를 뜻하는 denum1, num1, 두 번째 분수의 분자와 분모를 뜻하는 denum2, num2가 매개변수로 주어집니다. 
두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
*/

class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        answer[0] = (denum1*num2) + (denum2*num1);  //분자
        answer[1] = num1 * num2;                    //분모
        int[] answer = new int[2];
        int temp = 0;
       
        
        
        for(int i=1; i<=answer[1]; i++){
            if(answer[0]%i==0 && answer[1]%i==0){
                //최대 공약수 구하기
                temp = i;
            }
        }
        
        //최종적으로 최대 공약수로 분자&분모 나눠주기
        answer[0] /= temp;
        answer[1] /= temp;
        
        return answer;
    }
}
