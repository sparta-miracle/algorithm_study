// https://school.programmers.co.kr/learn/courses/30/lessons/120889

class Solution {
    public int solution(int[] sides) {
        int a = 0;
        int b = 0;
        int h = sides[0];
        if ( h < sides[1] ) {
            a = h;
            h = sides[1];
        } else {
            a = sides[1];
        }

        if ( h < sides[2] ) {
            b = h;
            h = sides[2];
        } else {
            b = sides[2];
        }

        return ( h < a + b ) ? 1 : 2;
    }
}