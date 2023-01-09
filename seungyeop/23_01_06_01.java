import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] strNum = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] intNum = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for(int i = 0; i < 10; i++) {
            s = s.replaceAll(strNum[i], intNum[i]);
        }
        return Integer.parseInt(s);
    }
}
