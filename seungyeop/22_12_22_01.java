class Solution {
    public int solution(int[] common) {
        if (common[1] - common[0] == common[2] - common[1])  //등비인지를 먼저 확인할 경우 나누기 0이 되는 경우가 발생 가능함
            return common[common.length - 1] + common[1] - common[0];
        return common[common.length - 1] * (common[1] / common[0]);
    }
}
