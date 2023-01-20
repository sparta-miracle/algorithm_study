// https://school.programmers.co.kr/learn/courses/30/lessons/67256

import java.util.HashMap;
import java.util.Map;

class Solution {
    private final Map<Integer, Integer[]> KEYPAD = new HashMap<>() {{
        put(0, new Integer[]{3, 1});
        put(1, new Integer[]{0, 0});
        put(2, new Integer[]{0, 1});
        put(3, new Integer[]{0, 2});
        put(4, new Integer[]{1, 0});
        put(5, new Integer[]{1, 1});
        put(6, new Integer[]{1, 2});
        put(7, new Integer[]{2, 0});
        put(8, new Integer[]{2, 1});
        put(9, new Integer[]{2, 2});
        // -1 = *
        put(-1, new Integer[]{3, 0});

        // -2 = 3
        put(-2, new Integer[]{3, 2});
    }};

    public String solution(int[] numbers, String hand) {
        Map<Character, Integer[]> handMap = new HashMap<>();

        handMap.put('L', KEYPAD.get(-1));
        handMap.put('R', KEYPAD.get(-2));

        Character handedness;
        if (hand.equals("right")) {
            handedness = 'R';
        } else {
            handedness = 'L';
        }

        StringBuilder handBuilder = new StringBuilder();
        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                handBuilder.append('L');
                handMap.replace('L', KEYPAD.get(number));
                continue;
            }

            if (number == 3 || number == 6 || number == 9) {
                handBuilder.append('R');
                handMap.replace('R', KEYPAD.get(number));
                continue;
            }

            int rDistance = getDistance(handMap.get('R'), KEYPAD.get(number));
            int lDistance = getDistance(handMap.get('L'), KEYPAD.get(number));

            if (rDistance < lDistance) {
                handBuilder.append('R');
                handMap.replace('R', KEYPAD.get(number));
            } else if (lDistance < rDistance) {
                handBuilder.append('L');
                handMap.replace('L', KEYPAD.get(number));
            } else {
                handBuilder.append(handedness);
                handMap.replace(handedness, KEYPAD.get(number));
            }
        }

        return handBuilder.toString();
    }

    private int getDistance(Integer[] coordinate1, Integer[] coordinate2) {
        int distance = 0;
        distance += Math.abs(coordinate1[0] - coordinate2[0]);
        distance += Math.abs(coordinate1[1] - coordinate2[1]);
        return distance;
    }
}