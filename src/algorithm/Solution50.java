package algorithm;

import java.util.*;
class Solution50 {
    public int[] solution(String s) {
        int[] answer = new int [s.length()];
        List <Character> list = new ArrayList<>();
        char [] s1 = s.toCharArray();
        for (int i = 0; i<s1.length; i++) {
            if (!list.contains(s1[i])) {
                list.add(s1[i]);
                answer[i] = -1;
            }else {
                int lastIndex = list.lastIndexOf(s1[i]);
                list.add(s1[i]);
                answer[i] = list.size() - (lastIndex + 1);
            }
        }
        return answer;
    }
}
