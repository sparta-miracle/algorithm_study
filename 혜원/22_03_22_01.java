//정수 내림차순으로 배치하기

import java.util.stream.*;
 
class Solution {
    public long solution(long n) {
      long answer = 0;
      long[] nums = Stream.of(String.valueOf(n).split(""))
          .mapToLong(Long::parseLong)
          .toArray();
      //내림차순
      for (int i = 0; i < nums.length; i++) {
        for (int j = 1 + i; j < nums.length; j++) {
          if (nums[i] < nums[j]) {
            Long temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
          }
        }
      }

      //배열 -> 하나의 숫자열
      StringBuilder stringBuilder = new StringBuilder();
      for (long num : nums) {
        stringBuilder.append(num);
      }
      answer = Long.valueOf(stringBuilder.toString());
      return answer;
    }
  }
