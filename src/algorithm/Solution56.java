package algorithm;

import java.util.*;
class Solution56 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        int min = score[0];
        int score1 [] = new int [m];
        int j = 0;
        if (score.length % m != 0) {
            for (int i = 0; i<score.length; i++) {
                if (score[i] > min) {
                    score1[j] = score[i];
                    j++;
                    Arrays.sort(score1);
                }else if (Arrays.binarySearch(score1, 0) < 0) {
                    score1[j] = min;
                }
            }
            Arrays.sort(score1);
            answer = score1[0] * m * score.length / m;
        }else {
            int s = 0;
            int sum = 0;
            for (int l = 0; l<score.length; l++) {
                score1[s]= score[l];
                if (s >= m-1) {
                    Arrays.sort(score1);
                    sum += score1[0] * m;
                    s = 0;
                }else {
                    s++;
                }
            }
            answer=sum;
        }

        return answer;
    }
}
