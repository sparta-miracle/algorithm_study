// https://school.programmers.co.kr/learn/courses/30/lessons/120849

import java.util.HashSet;

// 풀이
class Solution {
    public String solution(String my_string) {
        StringBuilder consonantsBuilder = new StringBuilder();
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        for (int i = 0; i < my_string.length(); i++) {
            if (!vowels.contains(my_string.charAt(i))) {
                consonantsBuilder.append(my_string.charAt(i));
            }
        }

        return consonantsBuilder.toString();
    }
}

// 모범 풀이
class Solution {
    public String solution(String my_string) {
        return my_string.replaceAll("[aeiou]", "");
    }
}