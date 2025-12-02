package algorithm;

import java.util.*;

public class S1 {
	public int[] solution(int []arr) {
		int[] answer = {};
		Stack<Integer> s = new Stack<>();

		for (int i = 0; i<arr.length; i++) {
			if (!s.isEmpty() && s.peek() == arr[i]) {
				continue;
			}

			s.push(arr[i]);
		}

		answer = new int[s.size()];

		for (int j = s.size() -1; j>=0; j--) {
			answer[j] = s.pop();
		}

		return answer;
	}
}
