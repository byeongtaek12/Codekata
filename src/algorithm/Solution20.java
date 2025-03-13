package algorithm;

import java.util.*;
class Solution20 {
    public long solution(long n) {
        long answer = 0;
        char [] answer1 = String.valueOf(n).toCharArray();
        Arrays.sort(answer1);
        StringBuilder sb = new StringBuilder();
        sb.append(new String(answer1));
        sb.reverse();
        answer = Long.parseLong(sb.toString());
        return answer;
    }
}
