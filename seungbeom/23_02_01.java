// https://www.acmicpc.net/problem/1927

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeatCount = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < repeatCount; i++) {
            int number = Integer.parseInt(br.readLine());
            if (number == 0) {
                System.out.println(queue.size() != 0 ? queue.poll() : 0);
            } else {
                queue.add(number);
            }
        }
    }
}