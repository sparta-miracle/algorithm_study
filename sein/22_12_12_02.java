//덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 quiz가 매개변수로 주어집니다. 
//수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 return하도록 solution 함수를 완성해주세요

class Solution {
    public String[] solution(String[] quiz) {
        String[] result1 = new String[2];
        String[] result3 = new String[quiz.length];
        int num1 = 0;
        int num2 = 0;
        int tot = 0;

       for(int i=0; i<quiz.length; i++){
                result1 = quiz[i].split("=");

                String[] result2 = result1[0].split(" ");

                if(result2[0].equals("-")){
                    num1 = Integer.parseInt(result2[1]);
                    num2 = Integer.parseInt(result2[3]);

                    if(result2[2].equals("-")) {
                        tot = (-num1) - num2;
                    }else{
                        tot = (-num1) + num2;
                    }
                }else {
                    num1 = Integer.parseInt(result2[0]);
                    num2 = Integer.parseInt(result2[2]);

                    if (result2[1].equals("-")) {
                        tot = num1 + (-num2);
                    } else {
                        tot = num1 + num2;
                    }
                }
                String result = String.valueOf(result1[1]).replaceAll("\\s", "");

                if(tot==Integer.parseInt(result)){
                    result3[i] = "O";
                }else{
                    result3[i] = "X";
                }
           }
        return result3;
    }
}
