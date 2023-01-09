class Solution {
    public int[] solution(long n) { //long[]으로 수정하여 푸는 것보다 공간복잡도를 줄임
        String Str = n + "";
        int[] answer = new int[Str.length()];
        for (int i = 0; i < Str.length(); i++) {
            answer[i] =  (int) (n % 10); //(int)를 추가해 나머지 값을 구할 수 있음
            n /= 10;
        }
        return answer;
    }
}
