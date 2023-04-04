//https://school.programmers.co.kr/learn/courses/30/lessons/120838
// 모스부호 (1)


class Solution {
 
  public String solution(String letter) {
        String[] array = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
                "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String answer = "";

        String letter2 = letter.toLowerCase();


        for (char x:letter2.toCharArray()) {
            int i = alphabet.indexOf(String.valueOf(x));
            System.out.println("i :" + i);
            answer+=array[i];
            answer+=" ";
        }

        return answer;
    }
}
