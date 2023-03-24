// https://www.acmicpc.net/problem/20040

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int[] roots;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int dotCount = Integer.parseInt(st.nextToken());
        int totalTurn = Integer.parseInt(st.nextToken());

        roots = new int[dotCount];

        for (int i = 0; i < dotCount; i++) {
            roots[i] = i;
        }

        int result = 0;

        for (int i = 1; i <= totalTurn; ++i) {
            st = new StringTokenizer(br.readLine());
            int firstDot = Integer.parseInt(st.nextToken());
            int secondDot = Integer.parseInt(st.nextToken());

            if(DrawLineAndValidateCycle(firstDot, secondDot)) {
                result = i;
                break;
            }
        }

        System.out.println(result);
        br.close();
    }

    public static int find(int i) {
        if (i == roots[i]) {
            return i;
        }

        return roots[i] = find(roots[i]);
    }

    public static boolean DrawLineAndValidateCycle(int firstDot, int secondDot) {
        int firstDotRoot = find(firstDot);
        int secondDotRoot = find(secondDot);

        if (firstDotRoot == secondDotRoot) {
            return true;
        } else {
            roots[secondDotRoot] = firstDotRoot;
            return false;
        }
    }
}