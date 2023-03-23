//시저 암호
// https://school.programmers.co.kr/learn/courses/30/lessons/12926
public class Practice_230323_01 {
    public String solution2(String s, int n) {
        //배열의 아스키 넘버를 찾는다.
        //입력받은 거리만큼 아스키 번호를 더해 추가해준다.
        //공백은 그냥 추가해준다.
        String answer = "";

        for (char x: s.toCharArray()) {
            //만약 아스키코드가 공백이 아니라면

            if (!(x == 32)) {
                // 아스키 문자 Z일 경우 a로 변환되야 됨.
                if(x==122 || x==90){
                    answer += (char)((x - 26)+n);
                }else {
                    //문자열에 n만큼 떨어진 문자를 추가
                    answer += (char) (x + n);
                }

            } else{
                //공백이면 그냥 공백추가
                answer += x;
            }
        }
        // -> 한바퀴 돌게됐을 때 에러난다... 어떻게 하지...
        return answer;
    }

    public String solution(String s, int n) {
        //배열의 아스키 넘버를 찾는다.
        //입력받은 거리만큼 아스키 번호를 더해 추가해준다.
        //공백은 그냥 추가해준다.
        String answer = "";

        for (char x: s.toCharArray()) {
            //만약 아스키코드가 공백이 아니라면
            if(x==122 || x==90){
                answer += (char)((x - 26)+n);
            }else if(x>=97 && x<=122) {
                //소문자일 경우
                if(x+n>122){
                    //만약 x+n이 122보다 크면 알파벳 한바퀴 돌았다는 뜻이니까
                    // x+n에서 122를 빼서 n 값을 구해준뒤,a코드 한단계 전인 96번에서 n값 만큼 더해준다.
                    int num = (x+n)-122;
                    answer += (char) (96 + num);
                }else if(x+n<=122){
                    //문자열에 n만큼 떨어진 문자를 추가
                    answer += (char) (x + n);
                }
            }else if(x>=65 && x<=90){
                //대문자일 경우
                if(x+n>90){
                    int num = (x+n)-90;
                    answer += (char) (64 + num);
                }
                else if(x+n<=90){
                    answer += (char) (x + n);
                }
            }else if((x == 32)){
                answer += x;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Practice_230323_01 t = new Practice_230323_01();
        System.out.println(t.solution("a b c d e f g h i j k l m n o p q r s t u v w x y z",1));
        System.out.println(t.solution("a b c d e f g h i j k l m n o p q r s t u v w x y z",2));
        System.out.println(t.solution("a b c d e f g h i j k l m n o p q r s t u v w x y z",3));
        System.out.println(t.solution("a b c d e f g h i j k l m n o p q r s t u v w x y z",4));
        System.out.println(t.solution("a b c d e f g h i j k l m n o p q r s t u v w x y z",5));
        System.out.println(t.solution("a b c d e f g h i j k l m n o p q r s t u v w x y z",6));
        System.out.println(t.solution("a b c d e f g h i j k l m n o p q r s t u v w x y z",7));
        System.out.println(t.solution("a b c d e f g h i j k l m n o p q r s t u v w x y z",8));
        System.out.println(t.solution("a b c d e f g h i j k l m n o p q r s t u v w x y z",9));
        System.out.println(t.solution("a b c d e f g h i j k l m n o p q r s t u v w x y z",10));
        System.out.println(t.solution("a b c d e f g h i j k l m n o p q r s t u v w x y z",11));
        System.out.println(t.solution("a b c d e f g h i j k l m n o p q r s t u v w x y z",12));
        System.out.println(t.solution("a b c d e f g h i j k l m n o p q r s t u v w x y z",13));
        System.out.println(t.solution("a b c d e f g h i j k l m n o p q r s t u v w x y z",14));
        System.out.println(t.solution("a b c d e f g h i j k l m n o p q r s t u v w x y z",15));
        System.out.println(t.solution("a b c d e f g h i j k l m n o p q r s t u v w x y z",16));
        System.out.println(t.solution("a b c d e f g h i j k l m n o p q r s t u v w x y z",17));
        System.out.println(t.solution("a b c d e f g h i j k l m n o p q r s t u v w x y z",18));
        System.out.println(t.solution("a b c d e f g h i j k l m n o p q r s t u v w x y z",19));
        System.out.println(t.solution("a b c d e f g h i j k l m n o p q r s t u v w x y z",20));
        System.out.println(t.solution("a b c d e f g h i j k l m n o p q r s t u v w x y z",21));
        System.out.println(t.solution("a b c d e f g h i j k l m n o p q r s t u v w x y z",22));
        System.out.println(t.solution("a b c d e f g h i j k l m n o p q r s t u v w x y z",23));
        System.out.println(t.solution("a b c d e f g h i j k l m n o p q r s t u v w x y z",24));
        System.out.println(t.solution("a b c d e f g h i j k l m n o p q r s t u v w x y z",25));


    }
}
