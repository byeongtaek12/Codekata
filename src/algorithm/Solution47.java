package algorithm;

import java.util.*;
class Solution47 {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        Arrays.sort(strings, (a,b) -> {
            if (a.charAt(n)==b.charAt(n)) {
                return a.compareTo(b);
            }
            return Character.compare(a.charAt(n),b.charAt(n));
        });


        answer=strings;
        return answer;
    }
}

