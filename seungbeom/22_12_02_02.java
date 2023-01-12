// https://school.programmers.co.kr/learn/courses/30/lessons/120842?language=java

class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];

        int x = 0;
        while ( x < num_list.length ) {
            for (int y = 0; y < n; y++) {
                answer[x/n][y] = num_list[x++];
            }
        }

        return answer;
    }
}