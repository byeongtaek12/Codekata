package algorithm;

import java.util.*;
class Solution46 {
    public int solution(String s) {
        int answer = 0;
        Map <String, String> word = Map.of("zero","0", "one","1" , "two","2", "three","3", "four","4",
                "five","5", "six","6", "seven","7", "eight","8","nine","9");

        for (String key: word.keySet()) {
            if (s.contains(key)) {
                s=s.replace(key, word.get(key));
            }
        }
        answer=Integer.valueOf(s);

        return answer;
    }
}
