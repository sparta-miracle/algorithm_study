//정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        
        answer[0] = Arrays.stream(array).max().getAsInt();

        answer[1] = IntStream.range(0, array.length)
                        .filter(i -> answer[0]==(array[i]))
                        .findFirst()
                        .orElse(-1);
        
        return answer;
    }
}
