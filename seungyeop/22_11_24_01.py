class Solution {
    public String solution(int age) {
        String strAge = Integer.toString(age);
        String alp = "abcdefghij";
        String answer = "";
        for(int i = 0; i < strAge.length(); i++) {
            System.out.println(strAge.charAt(i));
                answer += alp.charAt( Integer.parseInt(String.valueOf(strAge.charAt(i))));
        }
        return answer;
    }
}
