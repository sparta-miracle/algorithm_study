import java.util.Arrays;

class Solution {
    public String solution(String[] seoul) {
        int idx = Arrays.asList(seoul).indexOf("Kim");  //배열에서는 ArrayList에서만 indexOf를 지원함
        return "김서방은 " + idx + "에 있다";
    }
}
