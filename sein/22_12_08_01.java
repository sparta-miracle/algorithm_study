//영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다. 
//문자열 numbers가 매개변수로 주어질 때, numbers를 정수로 바꿔 return 하도록 solution 함수를 완성해 주세요.

class Solution {
    public Long solution(String numbers) {
      
        String result = numbers.replaceAll("one", "1")
                                .replaceAll("two", "2")
                                .replaceAll("three", "3")
                                .replaceAll("four", "4")
                                .replaceAll("five", "5")
                                .replaceAll("six", "6")
                                .replaceAll("seven","7")
                                .replaceAll("eight", "8")
                                .replaceAll("nine", "9")
                                .replaceAll("zero", "0");
        
           
	   return Long.parseLong(result);
    }
}
