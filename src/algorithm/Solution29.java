package algorithm;

import java.util.Arrays;
class Solution29 {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        int min=Arrays.stream(arr).min().orElse(-1);
        if (arr.length>1) {
            answer = Arrays.stream(arr).filter(a-> a>min).toArray();
        }else {
            answer= new int[]{-1};
        }

        return answer;
    }
}
