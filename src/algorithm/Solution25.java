package algorithm;

import java.util.*;
class Solution25 {
    public int[] solution(int[] arr, int divisor) {
        List <Integer> list = new ArrayList<>();
        for (int arr1 : arr) {
            if (arr1%divisor==0) {
                list.add(arr1);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i<list.size(); i++) {
            answer[i]=list.get(i);
        }
        if(list.size()==0) {
            answer= new int[]{-1};
        }
        Arrays.sort(answer);
        return answer;
    }
}
