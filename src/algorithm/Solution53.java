package algorithm;

import java.util.*;
class Solution53 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int [score.length];
        int min = 0;
        List <Integer> list = new ArrayList<>();
        for (int i = 0; i<score.length; i++) {
            if (list.size() < k) {
                list.add(score[i]);
                min = Collections.min(list);
            }else {
                if (min < score[i]) {
                    list.remove(list.indexOf(min));
                    list.add(score[i]);
                    min = Collections.min(list);
                }
            }
            answer[i]= min;
        }
        return answer;
    }
}
