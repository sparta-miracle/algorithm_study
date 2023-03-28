package algorithomStudy;
import java.util.Scanner;
// 직사각형 별찍기
// https://school.programmers.co.kr/learn/courses/30/lessons/12919
public class Practice_230328_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

              for (int i = 0; i < m; i++) {
                  for (int j = 0; j < n; j++) {
                      System.out.print("*");
                  }
                  System.out.println();
              }

    }
}
