package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p9934 {
    private static int length = 0;
    private static int index = 1;
    private static int[] tree;
    private static int[] buildings;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        length = (int) Math.pow(2, n) - 1;
        buildings = new int[length + 1];
        tree = new int[length + 1];
        for (int i = 1; i <= length; i++) {
            buildings[i] = Integer.parseInt(st.nextToken());
        }

        inOrder(1);

        int depth = 1;
        for (int j = 1; j <= length; j++) {
            System.out.print(tree[j]);
            if (j == Math.pow(2, depth) - 1) {
                depth++;
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }

    }

    private static void inOrder(int now) {
        if (now > length) {
            return;
        }
        inOrder(now * 2);
        tree[now] = buildings[index++];
        inOrder(now * 2 + 1);
    }
}
