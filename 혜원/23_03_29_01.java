#모스부호 (1)

  import java.util.*;
class Solution {
 public String solution(String letter) {
      String answer = "";
      HashMap<String, String> mosAlpha = new HashMap<>();
      String[] mos = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
          ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--",
          "-..-", "-.--", "--.."};
      String[] alpha = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
     // 키밸류 쌍으로 모스_ 알바벳을 맵에 저장
      for(int i = 0; i < alpha.length; i++){
       mosAlpha.put(mos[i],alpha[i]);
     }
      //모스부호 -> 배열 
      String[] letterArr = letter.split(" ");
      //System.out.println(Arrays.toString(letterArr));

      for (String s : letterArr) {
        answer += mosAlpha.get(s);// 해당 알파벳이 나옴
       // System.out.println(mosAlpha.get(s));
      }
      System.out.println(answer);
      return answer;
    }
  }
