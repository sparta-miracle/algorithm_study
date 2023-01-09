/*
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
*/

class Solution {
    public int[] solution(long n) {
        String strNum = Long.toString(n);
        int[] answer = new int[strNum.length()];
        int a = 0;
        int i = 0;
        
        //자연수 자리수 구하기
        while(n>=1){
            a = (int)(n/10);          //나눠질수
            answer[i] = (int)(n%10);  //자릿수
            n = a;
            i++;
        }
    
        return answer;
    }
}
