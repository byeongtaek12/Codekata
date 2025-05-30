package algorithm;

import java.util.*;
class Solution49 {
    public int[] solution(int[] numbers) {

        List <Integer> list = new ArrayList<>();

        for (int i = 0; i<numbers.length-1; i++) {
            for (int j = i+1; j<numbers.length; j++) {
                if (list.contains(numbers[i]+numbers[j])) {
                    continue;
                }
                list.add(numbers[i]+numbers[j]);
            }
        }
        int[] answer = new int [list.size()];
        for (int i = 0; i<list.size(); i++) {
            answer[i]=list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
