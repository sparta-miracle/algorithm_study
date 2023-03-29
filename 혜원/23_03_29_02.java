# 이진 변환 반복하기


import java.util.*;
class Solution {
    public int[] solution(String s) {
      int[] answer = new int[2];
      int cnt = 0;
      int zeroCnt = 0;

      while (!s.equals("1")){
        int v1 = s.length();
        String allOne = s.replaceAll("0","");
        int v2 = allOne.length();
        zeroCnt += v1-v2; //변환 과정에서 제거된 모든 0의 개수

        int allOneLength = allOne.length();
        String binaryString = Integer.toBinaryString(allOneLength);
        s = binaryString;


        cnt++; //이진변환 횟수 1씩 증가
        //System.out.println("Z : "+zeroCnt+","+"c : "+cnt);

      }
      answer[0] = cnt;
      answer[1] = zeroCnt;
      System.out.println(Arrays.toString(answer));
      return answer;

    }
  }
