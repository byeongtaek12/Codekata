package algorithm;

import java.util.*;
class Solution34 {
    public String solution(String s) {
        String answer = "";
        char [] s1 = s.toCharArray();
        Arrays.sort(s1);
        String s2 = new String(s1);
        StringBuilder sb = new StringBuilder(s2);
        sb.reverse();

        answer=sb.toString();

        return answer;
    }
}
