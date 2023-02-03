// https://www.acmicpc.net/problem/11286

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeatCount = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue =  new PriorityQueue<>(new absoluteComparator());

        for (int i = 0; i < repeatCount; i++) {
            int number = Integer.parseInt(br.readLine());
            if (number == 0) {
                System.out.println(queue.size() != 0 ? queue.poll() : 0);
            } else {
                queue.add(number);
            }
        }
    }

    static class absoluteComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            if (Math.abs(o1) > Math.abs(o2)) {
                return 1;
            } else if (Math.abs(o1) < Math.abs(o2)) {
                return -1;
            }

            if (o1 > o2) {
                return 1;
            } else if (o1 < o2){
                return -1;
            } else {
                return 0;
            }
        }
    }
}