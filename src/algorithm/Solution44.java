package algorithm;

import java.util.*;
class Solution44 {
    public int solution(int[][] sizes) {
        int answer = 0;


        for (int [] size : sizes) {
            Arrays.sort(size);
        }

        int max = sizes[0][0];
        int max1 = sizes[0][1];

        for (int i = 0; i<sizes.length; i++) {
            if (max<sizes[i][0]) {
                max=sizes[i][0];
            }

            if (max1<sizes[i][1]) {
                max1=sizes[i][1];
            }
        }
        answer= max*max1;

        return answer;
    }
}
