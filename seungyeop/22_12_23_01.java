class Solution {
    public int solution(int[] dot) {
        int answer = (dot[0] > 0 && dot[1] > 0) ? 1 :
        ((dot[0] < 0 && dot[1] > 0) ? 2 :
        ((dot[0] < 0 && dot[1] < 0) ? 3 : 4));
        return answer;
    }
}
