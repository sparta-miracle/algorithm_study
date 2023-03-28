package programmers;

import java.util.Scanner;

public class SquareStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder stars = new StringBuilder();
        for(int i=0;i<a;i++) {
            stars.append("*");
        }

        for(int i=0;i<b;i++) {
            System.out.print(stars);
            System.out.println();
        }
    }
}
