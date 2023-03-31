package programmers;

public class BinaryTransform {
    private static int deleteCount;
    private static int transformCount;

    public int[] solution(String s) {
        int[] answer = new int[2];
        deleteCount = 0;
        transformCount = 0;
        binaryTransformer(s);

        answer[0] = transformCount;
        answer[1] = deleteCount;
        return answer;
    }

    private static void binaryTransformer(String s) {
        if (s.equals("1")) {
            return;
        }

        int temp = 0;
        String[] strs = s.split("");
        for (int i = 0; i < strs.length; i++) {
            String token = strs[i];
            if (token.equals("0")) {
                deleteCount++;
            } else {
                temp++;
            }
        }
        transformCount++;
        binaryTransformer(Integer.toBinaryString(temp));
    }

}
