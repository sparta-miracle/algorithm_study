class Solution {
    public String[] solution(String my_str, int n) {
        int L = (my_str.length() + n - 1) / n;  // 이 부분을 생각해내기가 어려웠다.
      // if (my_str.length() % n == 0) answer = new String[my_str.length() / n];  // 다른 풀이 방법
      //  else answer = new String[my_str.length() / n + 1];
      
        String[] answer = new String[L];
        for(int i=0; i < L; i++) {
            int start = i * n;
            int end = start + n >= my_str.length()? my_str.length() : start + n;  //if문 대신 사용할 수 있는 방식, 3항 연산자
            answer[i] = my_str.substring(start, end);
        }
        return answer;
    }
    
}
