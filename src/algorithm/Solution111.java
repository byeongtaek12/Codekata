package algorithm;

import java.util.*;
class Solution111 {
	public int[] solution(int n, String[] words) {
		int[] answer = new int[2];
		Map<String,Integer> m = new HashMap<>();
		m.put(words[0], 0);

		for (int i = 0; i<words.length - 1; i++) {
			char last = words[i].charAt(words[i].length() - 1);
			char first = words[i+1].charAt(0);
			if (last != first) {
				answer[0] = (i+1) % n + 1;
				answer[1] = (i+1) / n + 1;
				break;
			}

			if (!m.containsKey(words[i+1])) {
				m.put(words[i+1], i+1);
			} else {
				answer[0] = (i+1) % n + 1;
				answer[1] = (i+1) / n + 1;
				break;
			}
		}

		return answer;
	}
}
