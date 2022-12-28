import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        Stack<Integer> stack = new Stack<>();  //stack 만들기
        int count = 0;
        for (int i : ingredient) {
            stack.add(i);
            if (stack.size() >= 4 && stack.elementAt(stack.size() - 1) == 1
                && stack.elementAt(stack.size() - 2) == 3
                && stack.elementAt(stack.size() - 3) == 2
                && stack.elementAt(stack.size() - 4) == 1) {
                count++;
                stack.pop();stack.pop();stack.pop();stack.pop();
            }
        }
        return count;
    }
}
