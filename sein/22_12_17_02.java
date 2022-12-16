/*
네오는 평소 프로도가 비상금을 숨겨놓는 장소를 알려줄 비밀지도를 손에 넣었다. 그런데 이 비밀지도는 숫자로 암호화되어 있어 위치를 확인하기 위해서는 암호를 해독해야 한다. 다행히 지도 암호를 해독할 방법을 적어놓은 메모도 함께 발견했다.

지도는 한 변의 길이가 n인 정사각형 배열 형태로, 각 칸은 "공백"(" ") 또는 "벽"("#") 두 종류로 이루어져 있다.
전체 지도는 두 장의 지도를 겹쳐서 얻을 수 있다. 각각 "지도 1"과 "지도 2"라고 하자. 지도 1 또는 지도 2 중 어느 하나라도 벽인 부분은 전체 지도에서도 벽이다. 지도 1과 지도 2에서 모두 공백인 부분은 전체 지도에서도 공백이다.
"지도 1"과 "지도 2"는 각각 정수 배열로 암호화되어 있다.
암호화된 배열은 지도의 각 가로줄에서 벽 부분을 1, 공백 부분을 0으로 부호화했을 때 얻어지는 이진수에 해당하는 값의 배열이다.
*/

//Sein이 짠 코드 
import java.util.ArrayList;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        int[] temp = new int[n];
        int[] temp2 = new int[n];
        String[] temp3 = new String[n];
        int target = 0;
        int target2 = 0;
        String result1 = "";
        String result2 = "";
        ArrayList<String> temp_result1 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String last1 = "";
            target = arr1[i];  
            target2 = arr2[i];  
            for (int j = 0; j < n; j++) {
                if (target % 2 == 1 || target2 % 2 == 1) {
                    last1 += 1;
                } else {
                    last1 += 0;
                }
                target /= 2;
                target2 /= 2;
            }
            StringBuffer sb1 = new StringBuffer(last1);
            String reversedStr1 = sb1.reverse().toString();
            temp_result1.add(reversedStr1);
        }

        for (int i = 0; i < n; i++) {
            result1 = temp_result1.get(i).replace("1", "#");
            result2 = result1.replace("0", " ");
            temp3[i] = result2;
        }
        return result3;
    }
}


//================================================================================================================================================///

//승엽님 코드참고해서 다시 이해해서 짠 코드 => 역시 알신..코드가 훨씬 깔끔하고 한눈에 알아보기 좋다. 변수를 많이 안쓴 상태로 코드를 짜다니 ㅠㅠ
//느낀점 : 알고리즘하면서 논리?구조적으로 너무 딥하게 가지 않으려고 노력해야겠다고 느꼈다.

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        int target=0;
        int target2=0;
        String[] result = new String[n];

        for (int i = 0; i<n; i++) {
            String temp = "";
            target = arr1[i];
            target2 = arr2[i];

            for(int j=0; j<n; j++) {
                if (target % 2 == 1 || target2 % 2 == 1) {
                    temp = "#" + temp;
                } else {
                    temp = " " + temp;
                }
                target /= 2;
                target2 /= 2;
            }
            result[i] = temp;
        }
    return result;
   }
}
