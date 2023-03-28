// https://school.programmers.co.kr/learn/courses/30/lessons/12969

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        StringBuilder starBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            starBuilder.append("*");
        }

        for (int i = 0; i < m; i++) {
            System.out.println(starBuilder.toString());
        }
    }
}