package algorithm;

import java.util.*;
class Solution76 {
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		Map<String, Integer> map = new HashMap<>();

		for (String p : participant) {
			map.put(p, map.getOrDefault(p, 0) + 1);
		}

		for (String c : completion) {
			map.put(c, map.get(c) - 1);
		}

		for (String a : map.keySet()) {
			if (map.get(a) > 0) {
				answer = a;
			}
		}

		return answer;
	}
}
