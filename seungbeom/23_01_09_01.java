// https://school.programmers.co.kr/learn/courses/30/lessons/82612

class Solution {

    // 풀이 1. For문을 이용해 비용 합계 구하기
    public long solution1(int price, int money, int count) {
        long sumPrice = 0;
        for (int i = 1; i <= count; i++) {
            sumPrice = sumPrice + price * i;
        }
        long answer = sumPrice - money;
        return (answer > 0) ? answer : 0;
    }

    // 풀이 2. 등차수열의 합 공식 이용하여 비용 합계 구하기
    public long solution2(int price, int money, int count) {
        // 등차수열의 1번째 항(a)~ n번째 항(l)까지의 합: n(a + l) / 2
        // 첫번째 항(a) = price
        // n번째 항(l) = price * count
        long sumPrice = count * (price + (long) (price * count)) / 2;
        long answer = sumPrice - money;
        return (answer > 0) ? answer : 0;
    }
}