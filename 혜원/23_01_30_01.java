// 두 개 뽑아서 더하기
import java.util.*;

class Solution {
                
 public Integer[] solution(int[] numbers) {

                HashSet<Integer> answer = new HashSet<>();

                for (int i = 0; i < numbers.length; i++) {
                    for (int j = i+1; j < numbers.length; j++) {
                        answer.add(numbers[i] + numbers[j]);
                    }
                }

                Integer[] arr = answer.toArray(new Integer[0]);
                Arrays.sort(arr);

                for (int i:arr) {
                    System.out.println(i);
                }
                System.out.println(arr);
              return arr;

   }
}
