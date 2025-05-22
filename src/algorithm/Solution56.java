package algorithm;

import java.util.*;

class Solution56 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        for(int i = 0; i < score.length / 2; i++) {
            int temp = score[i];
            score[i] = score[score.length - 1 - i];
            score[score.length - 1 - i] = temp;
        }

        int boxCount = score.length / m;

        for(int i = 0; i < boxCount; i++) {
            int min = Integer.MAX_VALUE;
            int start = i * m;
            int end = start + m;


            for(int j = start; j < end; j++) {
                if(score[j] < min) {
                    min = score[j];
                }
            }
            answer += min * m;
        }

        return answer;
    }

}