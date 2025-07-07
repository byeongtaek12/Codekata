package algorithm;

import java.util.*;

class Solution66 {
	public int[] solution(String[] keymap, String[] targets) {
		Map<Character, Integer> keyPressCount = new HashMap<>();

		for (String key : keymap) {
			for (int i = 0; i < key.length(); i++) {
				char c = key.charAt(i);
				keyPressCount.put(c, Math.min(keyPressCount.getOrDefault(c, Integer.MAX_VALUE), i + 1));
			}
		}

		int [] answer = new int [targets.length];

		for (int i = 0; i < targets.length; i++) {
			int total = 0;
			for (char c : targets[i].toCharArray()) {
				if (!keyPressCount.containsKey(c)) {
					total = -1;
					break;
				} else {
					total += keyPressCount.get(c);
				}
			}
			answer[i] = total;
		}

		return answer;
	}
}
