class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] strNum = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < 10; i++) {
            numbers = numbers.replace(strNum[i], Integer.toString(i));
        }
        answer = Long.parseLong(numbers);   //Int.parseInt만 쓰다가 Long.parseLong 처음 써봄
        return answer;
    }
}
