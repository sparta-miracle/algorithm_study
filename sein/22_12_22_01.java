/*
등차수열 혹은 등비수열 common이 매개변수로 주어질 때, 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.
*/

class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        int a = common[1]-common[0];
        int b = common[2]-common[1];
        
        if(a==b){
            //등차수열
             answer = common[common.length-1] + a;
        }else{
            //등비수열(공비구해주기)
            int num = b/a;
            answer = common[common.length-1] * num;
        }
        
        return answer;
    }
}
//F(n-1)+a 등차수열 공식 -> a는 공차(앞 뒤 숫자 빼면 구할 수 있음)
//F(n-1)*a 등비수열 공식 -> a는 공비
