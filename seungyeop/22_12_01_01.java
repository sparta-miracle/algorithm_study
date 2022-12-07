class Solution {
    public int solution(int hp) {
        int generalAnt = hp / 5;
        int soldierAnt = hp % 5 / 3;
        int workerAnt = hp % 5 % 3;
        int answer = generalAnt + soldierAnt + workerAnt;
        return answer;
    }
}
