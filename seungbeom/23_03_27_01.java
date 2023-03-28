// https://school.programmers.co.kr/learn/courses/30/lessons/1845

import java.util.HashSet;
import java.util.Iterator;

class Solution {
    public int solution(int[] nums) {
        int n = nums.length / 2;
        int[] deduplicatedNums = deduplicate(nums);

        return Math.min(n, deduplicatedNums.length);
    }

    public int[] deduplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int[] deduplicatedNums = new int[set.size()];
        Iterator<Integer> it = set.iterator();
        for (int i = 0; i < deduplicatedNums.length; i++) {
            deduplicatedNums[i] = it.next();
        }

        return deduplicatedNums;
    }
}