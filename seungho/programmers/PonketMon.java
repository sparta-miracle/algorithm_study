package programmers;

import java.util.HashSet;
import java.util.Set;

public class PonketMon {
    public int solution(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        return (nums.length / 2) < set.size() ? nums.length / 2 : set.size();

    }
}
